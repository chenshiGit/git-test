package com.mijing.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * Created by MyPC on 2019/7/31.
 */
public interface PermissionDao {
    /**
     * 查询用户的角色 菜单 权限
     */
    JSONObject getUserPermission(String username);

    /**
     * 查询所有的菜单
     */
    Set<String> getAllMenu();

    /**
     * 查询所有的权限
     */
    Set<String> getAllPermission();
}
