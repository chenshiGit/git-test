package com.mijing.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.mijing.dao.UserDao;
import com.mijing.service.UserService;
import com.mijing.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MyPC on 2019/7/31.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public JSONObject listUser(JSONObject jsonObject) {
        CommonUtil.fillPageParam(jsonObject);
        int count = userDao.countUser(jsonObject);
        List<JSONObject> list = userDao.listUser(jsonObject);
        return CommonUtil.successPage(jsonObject, list, count);
    }

    @Override
    public JSONObject getAllRoles() {
        return null;
    }

    @Override
    public JSONObject addUser(JSONObject jsonObject) {
        return null;
    }

    @Override
    public JSONObject updateUser(JSONObject jsonObject) {
        return null;
    }

    @Override
    public JSONObject listRole() {
        return null;
    }

    @Override
    public JSONObject listAllPermission() {
        return null;
    }

    @Override
    public JSONObject addRole(JSONObject jsonObject) {
        return null;
    }

    @Override
    public JSONObject updateRole(JSONObject jsonObject) {
        return null;
    }

    @Override
    public JSONObject deleteRole(JSONObject jsonObject) {
        return null;
    }
}
