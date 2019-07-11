package com.mijing.controller;


import  io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mijing.service.TestIBaseInfoService;
import com.mijing.dto.*;
import com.mijing.model.User;
import com.mijing.mapper.UserMapper;

import com.mijing.dto.ReqLoginDto;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 陈实 on 2019/7/4.
 */
@CrossOrigin
@RestController
@RequestMapping (value = "/login")
@Api(description = "查询用户信息",tags = "api-mijing")

public class LoginController {
//    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    @RequestMapping(value = "/validate")
//    @CrossOrigin
    public Object validate(@RequestBody ReqLoginDto reqLoginDto, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Integer> resultMap = new HashMap<>();
        resultMap.put("state",200);
        return resultMap;
    }
}

