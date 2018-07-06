package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Guru;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 13659 on 2018/7/6.
 */
public interface GuruDao {
    public int findTotal();
    public int insertGuru(@Param("guru") Guru guru);
    public int updateGuru(@Param("guru") Guru guru);
    public Guru findGuru(@Param("context") String context);
    public List<Guru> findByPage(@Param("start") int start,@Param("rows")int rows);
}
