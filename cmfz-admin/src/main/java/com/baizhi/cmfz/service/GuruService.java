package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Guru;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 13659 on 2018/7/6.
 */
public interface GuruService {
    public HashMap<String,Object> queryByPage(int page, int rows);
}
