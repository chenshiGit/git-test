package com.mijing.config.shiro;

import com.mijing.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSONObject;

import java.util.Collection;

/**
 * Created by MyPC on 2019/7/25.
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private LoginService loginService;

    @Override
    @SuppressWarnings("unchecked")
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Session session = SecurityUtils.getSubject().getSession();
        //查询用户的权限
        JSONObject permission = (JSONObject) session.getAttribute("userPermission");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions((Collection<String>) permission.get("permissionList"));

        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String loginName = (String) authenticationToken.getPrincipal();
//        String password = new String((char[]) authenticationToken.getCredentials());
        JSONObject user = loginService.getUserByName(loginName);
        System.out.println(user);
        if (user == null) {
            //没找到帐号
            throw new UnknownAccountException();
        }
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    user.getString("username"),
                    user.getString("password"),
//                    ByteSource.Util.bytes("salt"),
                    getName()
            );

        //session中不需要保存密码
        user.remove("password");
        //将用户信息放入session中
        SecurityUtils.getSubject().getSession().setAttribute("userInfo",user);
        return authenticationInfo;
    }
}
