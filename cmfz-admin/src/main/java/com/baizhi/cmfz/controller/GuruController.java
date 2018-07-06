package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by 13659 on 2018/7/6.
 */
@Controller
@RequestMapping("/guru")
public class GuruController {
    @Autowired
    private GuruService gs;
    @RequestMapping("/search")
    public @ResponseBody HashMap<String,Object> searchByPage(int page, int rows){
        return gs.queryByPage(page, rows);
    }
}
