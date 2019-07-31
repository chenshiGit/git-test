package com.mijing.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

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
