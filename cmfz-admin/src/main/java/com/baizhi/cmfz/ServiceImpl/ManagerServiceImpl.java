package com.baizhi.cmfz.ServiceImpl;

import com.baizhi.cmfz.dao.ManagerDao;
import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Random;
import java.util.UUID;

/**
 * Created by 13659 on 2018/7/4.
 */
@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerDao md;



    @Transactional
    public int addManager(Manager manager) {
        Random ran=new Random();

        String strs="0123456789abcdefghijklmnopqistuvwxyzABCDEFGHIJKLMNOPQISTUVWXYZ";
        char[] charArray = strs.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<6;i++){

            sb.append(charArray[ran.nextInt(strs.length())]);
        }



        String id= UUID.randomUUID().toString().replace("-","");
        manager.setManagerId(id);
        manager.setManagerStatus("已激活");
        String salt=sb.toString();
        String pwd= DigestUtils.md5Hex(manager.getManagerPassword()+""+salt);
        manager.setManagerSalt(salt);
        manager.setManagerPassword(pwd);


        return md.insertManager(manager);

    }

    @Override
    @Transactional
    public Manager queryManager(String name, String password) {

        Manager manager=md.findManager(name);
        String salt=manager.getManagerSalt();
        String pwd=DigestUtils.md5Hex(password+""+salt);
      if(pwd.equals(manager.getManagerPassword())){
          return manager;
      }
      return  null;
    }

}
