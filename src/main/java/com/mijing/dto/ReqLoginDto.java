package com.mijing.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ReqLoginDto {
    @ApiModelProperty(notes="用户名")
    private String userName;
    @ApiModelProperty(notes="密码")
    private String password;
}
