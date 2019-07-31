package com.mijing.service.impl;

import com.mijing.dto.*;
import com.mijing.dto.User;
import com.mijing.dao.UserMapper;
import com.mijing.service.TestIBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 陈实 on 2019/6/20.
 */
@Service
public class TestBaseInfoService implements TestIBaseInfoService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findBaseInfo(TestReqBaseInfoDto dto) {

//        TestResBaseInfoDto trbi = new TestResBaseInfoDto();

        User user=userMapper.getOne(dto.getId());


        return user;
    }
//    public static void main (String[] args){
//        TestReqBaseInfoDto testDto = new TestReqBaseInfoDto();
//        System.out.println(testDto.getId());
//    }
}
