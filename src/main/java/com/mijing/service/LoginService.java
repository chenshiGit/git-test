package com.mijing.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by 陈实 on 2019/7/23.
 */
public interface LoginService {
    /**
     * 登录表单提交
     */
    JSONObject authLogin(JSONObject jsonObject);

    /**
     * 根据用户名和密码查询对应的用户
     *
     * @param userName 用户名
//     * @param passWord 密码
     */
    JSONObject getUserByName(String userName);
//    JSONObject getUser(String userName, String passWord);

    /**
     * 查询当前登录用户的权限等信息
     */
    JSONObject getInfo();

    /**
     * 退出登录
     */
    JSONObject logout();
}
