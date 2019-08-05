package com.mijing.controller;


import com.mijing.dto.ReqLoginDto;
import com.mijing.service.LoginService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 陈实 on 2019/7/4.
 */
@CrossOrigin
@RestController
@RequestMapping (value = "/login")
@Api(description = "查询用户信息",tags = "api-mijing")

public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/validate", method = RequestMethod.POST)
//    @RequestMapping(value = "/validate")
//    @CrossOrigin
    public Object validate(@RequestBody ReqLoginDto reqLoginDto, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Integer> resultMap = new HashMap<>();
        resultMap.put("state",200);
        return resultMap;
    }

    @PostMapping(value = "/auth")
    public JSONObject authLogin(@RequestBody JSONObject requestJson){
        return loginService.authLogin(requestJson);
    }

    @PostMapping(value = "/getInfo")
    public JSONObject getInfo(){
        return loginService.getInfo();
    }

    /**
     * 登出
     */
    @PostMapping("/logout")
    public JSONObject logout() {
        return loginService.logout();
    }
}

