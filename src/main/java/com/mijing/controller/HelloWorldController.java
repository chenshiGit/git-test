package com.mijing.controller;

import  io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mijing.service.TestIBaseInfoService;
import com.mijing.dto.*;
import com.mijing.dto.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 陈实 on 2019/6/20.
 */
@RestController
@RequestMapping (value = "/test")
@Api(description = "查询用户信息",tags = "api-mijing")

public class HelloWorldController {
    @Autowired
    private TestIBaseInfoService testiBaseInfoService;
//    @Autowired
//    private UserMapper userMapper;

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public Object helloWorld(@RequestBody TestReqBaseInfoDto dto, HttpServletRequest request, HttpServletResponse response) {
//        if (dto == null) {
//            response.setStatus(Er.PARAM_ERR.getCode());
//            return Er.PARAM_ERR.getMsg();
//        }
        User userDto = testiBaseInfoService.findBaseInfo(dto);
        List<User> userDtos = new ArrayList<>();
        userDtos.add(userDto);
        return userDtos;
//        return dto;
    }
//    @RequestMapping("/getUsers")
//    public List<User> getUsers() {
//        List<User> users=userMapper.getAll();
//        return users;
//    }



}
