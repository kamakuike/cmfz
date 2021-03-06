package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 13659 on 2018/7/5.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService ms;
    @RequestMapping("/search")
    @ResponseBody
    public List<Menu> searchMenu(){
        return  ms.queryMenu();
    }
}
