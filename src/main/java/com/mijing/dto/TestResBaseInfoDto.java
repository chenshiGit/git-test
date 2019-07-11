package com.mijing.dto;

import lombok.Data;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;

/**
 * Created by 陈实 on 2019/6/20.
 */
@Data
//@ApiModel("基础信息")
public class TestResBaseInfoDto {
        //    @ApiModelProperty(notes = "用户ID")
        private String user_id = "001";
        //    @ApiModelProperty(notes = "用户名")
        private String user_name = "admin";
        //    @ApiModelProperty(notes = "昵称")
        private String nick_name ="";
}
