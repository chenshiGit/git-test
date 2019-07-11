package com.mijing.model;

import com.mijing.mapper.UserMapper;
import com.oracle.webservices.internal.api.message.PropertySet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈实 on 2019/6/20.
 */
@Data
@ApiModel
public class User{
//    @ApiModelProperty(value="兵器榜排行" ,required=true)
    private Long id;
//    @ApiModelProperty(value="姓名" ,required=true)
    private String userName;
//    @ApiModelProperty(value = "称号" ,required=true)
    private String nickName;


//    @Override
//    public List<User> getAll() {
//        return null;
//    }
//
//    @Override
//    public User getOne(Long id) {
//        return null;
//    }
}
