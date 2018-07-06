package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 13659 on 2018/7/5.
 */
public interface PictureDao {
    public int insertPicture(@Param("picture") Picture picture);
    public List<Picture> findByPage(@Param("start") int start,@Param("rows") int rows);
    public int findTotal();
}
