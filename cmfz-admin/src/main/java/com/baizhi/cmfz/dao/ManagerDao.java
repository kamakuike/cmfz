package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Manager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by 13659 on 2018/7/4.
 */
@Repository
public interface ManagerDao {
    public Manager findManager(@Param("managerName") String managerName);
    public int insertManager(@Param("manager") Manager manager);


}
