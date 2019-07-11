package com.mijing.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by 陈实 on 2019/6/20.
 */
@Data
@ApiModel("使用ID查询")
public class TestReqBaseInfoDto {
        @ApiModelProperty(notes = "兵器榜排名")
    private Long id;
        @ApiModelProperty(notes = "姓名")
    private String userName;
        @ApiModelProperty(notes = "称号")
    private String nickName;
}
