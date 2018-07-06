package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 13659 on 2018/7/5.
 */
@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    private PictureService ps;
    @RequestMapping("/search")
    public @ResponseBody HashMap<String,Object> searchAll(@RequestParam("page") int page, @RequestParam("rows") int rows ){


        return ps.queryByPage(page,rows);
    }
    @RequestMapping(value="/add",produces = "application/json;charset=utf-8")
    public @ResponseBody() String addPicture(@RequestParam("pictureDescription") String pictureDescription, @RequestParam("pictureStatus") String pictureStatus, @RequestParam("file") MultipartFile multipartFile, HttpSession session) throws IOException {
        String real =session.getServletContext().getRealPath("\\");
        String name=multipartFile.getOriginalFilename();
        int last=real.lastIndexOf("\\",real.lastIndexOf("\\")-1);
        String  fileName=real.substring(0,last)+"/upload/"+name;

        File file=new File(fileName);
        Picture picture=new Picture();

        picture.setPictureName(name);
        picture.setPictureStatus(pictureStatus);
        picture.setPictureDescription(pictureDescription);
        int a=ps.addPicture(picture);
        if(a>0){
             multipartFile.transferTo(file);
            return "轮播图插入成功";
        }
        return  "轮播图插入失败";
    }
}
