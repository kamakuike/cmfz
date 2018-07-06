package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;

/**
 * Created by 13659 on 2018/7/5.
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService ms;
    @RequestMapping("/login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password){
        Manager manager;
       manager= ms.queryManager(name,password);
       if(manager!=null){
           Cookie cookie=new Cookie("manager",manager.getManagerName());
           return "index";
       }
        return null;
    }
}
