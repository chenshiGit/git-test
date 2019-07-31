package com.mijing.service.impl;

import com.mijing.dao.LoginDao;
import com.mijing.service.LoginService;
import com.mijing.service.PermissionService;
import com.mijing.util.CommonUtil;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by 陈实 on 2019/7/23.
 */
@Service
public class LoginServiceImpl implements LoginService{


    @Autowired
    private LoginDao loginDao;

    @Autowired
    private PermissionService permissionService;

    @Override
    @SuppressWarnings("unchecked")
    public JSONObject authLogin(JSONObject jsonObject) {
        String userName = jsonObject.getString("userName");
        String passWord = jsonObject.getString("password");
        JSONObject info = new JSONObject();
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        try {
            currentUser.login(token);
            info.put("result", "success");
            info.put("state",200);
        } catch (AuthenticationException e) {
            info.put("result", "fail");
        }
        return CommonUtil.successJson(info);
    }

    @Override
    public JSONObject getUserByName(String userName) {
        return loginDao.getUser(userName);
    }

    @Override
    public JSONObject getInfo() {
        //从session获取用户信息
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute("userInfo");
        String username = userInfo.getString("username");
        JSONObject info = new JSONObject();
        JSONObject userPermission = permissionService.getUserPermission(username);
        session.setAttribute("userPermission", userPermission);
        info.put("userPermission", userPermission);
        return CommonUtil.successJson(info);
    }

    @Override
    public JSONObject logout() {
        try {
            Subject currentUser = SecurityUtils.getSubject();
            currentUser.logout();
        } catch (Exception e) {
        }
        return CommonUtil.successJson();
    }
}
