package com.mijing.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by MyPC on 2019/7/31.
 */
public interface PermissionService {
    /**
     * 查询某用户的 角色  菜单列表   权限列表
     */
    JSONObject getUserPermission(String username);
}
