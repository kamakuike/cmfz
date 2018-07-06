package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Picture;

import java.util.HashMap;
import java.util.List;


/**
 * Created by 13659 on 2018/7/5.
 */
public interface PictureService {
    public int addPicture(Picture picture);
    public HashMap<String,Object> queryByPage(int page, int rows);
}
