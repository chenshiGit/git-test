package com.mijing.dao;

import org.apache.ibatis.annotations.Param;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by MyPC on 2019/7/25.
 */
public interface LoginDao {
    /**
     * 根据用户名和密码查询对应的用户
     */
//    JSONObject getUser(@Param("username") String userName, @Param("password") String passWord);
    JSONObject getUser(@Param("username") String userName);
}
