package com.baizhi.cmfz.ServiceImpl;

import com.baizhi.cmfz.dao.GuruDao;
import com.baizhi.cmfz.entity.Guru;
import com.baizhi.cmfz.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 13659 on 2018/7/6.
 */
@Service
public class GuruServiceImpl implements GuruService {
    @Autowired
    private GuruDao gd;
    @Override
    public HashMap<String,Object> queryByPage(int page, int rows) {
        int start=(page-1)*rows;
        int total=gd.findTotal();
            List<Guru> list= gd.findByPage(start,rows);
            HashMap<String,Object> map=new HashMap<String,Object>();
            map.put("total",total);
            map.put("rows",list);
        return map;
    }
}
