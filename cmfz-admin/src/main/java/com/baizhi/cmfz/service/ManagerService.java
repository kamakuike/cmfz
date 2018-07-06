package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Manager;
import org.springframework.stereotype.Service;

/**
 * Created by 13659 on 2018/7/4.
 */

public interface ManagerService {
    public int addManager(Manager manager);
    public Manager queryManager(String name,String password);
}
