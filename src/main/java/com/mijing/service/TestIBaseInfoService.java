package com.mijing.service;
import com.mijing.dto.*;
import com.mijing.model.User;

/**
 * Created by 陈实 on 2019/6/20.
 */
public interface TestIBaseInfoService {
    User findBaseInfo(TestReqBaseInfoDto dto);
}
