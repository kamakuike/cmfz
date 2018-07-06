package com.baizhi.cmfz.ServiceImpl;

import com.baizhi.cmfz.dao.PictureDao;
import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.text.resources.FormatData;

import java.util.*;

/**
 * Created by 13659 on 2018/7/5.
 */
@Service
@Transactional
public class PictureServiceImpl implements PictureService{
    @Autowired
    private PictureDao pd;
    @Override
    @Transactional
    public int addPicture(Picture picture) {
        picture.setPictureId(UUID.randomUUID().toString().replace("-",""));
        int a=pd.insertPicture(picture);
        System.out.println(picture);
        return a;
    }

    @Override
    @Transactional
    public HashMap<String, Object> queryByPage(int page, int rows) {
        int start=(page-1)*rows;
        HashMap<String,Object> map=new HashMap<String,Object>();
        int total=pd.findTotal();
        System.out.println(total);
        List<Picture> list=pd.findByPage(start,rows);
        map.put("total",total);
        map.put("rows",list);
        return map;
    }


}
