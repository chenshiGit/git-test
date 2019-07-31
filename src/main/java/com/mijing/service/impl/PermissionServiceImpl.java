package com.mijing.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.mijing.dao.PermissionDao;
import com.mijing.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by MyPC on 2019/7/31.
 */
@Service
public class PermissionServiceImp implements PermissionService{

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public JSONObject getUserPermission(String username) {
        JSONObject userPermission = getUserPermissionFromDB(username);
        return userPermission;
    }

    /**
     * 从数据库查询用户权限信息
     */
    private JSONObject getUserPermissionFromDB(String username) {
        JSONObject userPermission = permissionDao.getUserPermission(username);
        //管理员角色ID为1
        int adminRoleId = 1;
        //如果是管理员
        String roleIdKey = "roleId";
        if (adminRoleId == userPermission.getIntValue(roleIdKey)) {
            //查询所有菜单  所有权限
            Set<String> menuList = permissionDao.getAllMenu();
            Set<String> permissionList = permissionDao.getAllPermission();
            userPermission.put("menuList", menuList);
            userPermission.put("permissionList", permissionList);
        }
        return userPermission;
    }
}
