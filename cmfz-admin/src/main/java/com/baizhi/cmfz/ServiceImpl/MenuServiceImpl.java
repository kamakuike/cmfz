package com.baizhi.cmfz.ServiceImpl;

import com.baizhi.cmfz.dao.MenuDao;
import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 13659 on 2018/7/5.
 */
@Service
public class MenuServiceImpl implements MenuService{
   @Autowired
    private MenuDao md;
    @Override
    @Transactional
    public List<Menu> queryMenu() {
        return md.findMenu();

    }
}
