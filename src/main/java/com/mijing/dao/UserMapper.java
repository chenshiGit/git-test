package com.mijing.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mijing.dto.User;

/**
 * Created by 陈实 on 2019/6/20.
 */
public interface UserMapper {
//    @Select("SELECT * FROM users")
//    @Results({
//            @Result(property = "兵器榜排行",column = "id"),
//            @Result(property = "姓名",  column = "user_name"),
//            @Result(property = "称号", column = "nick_name")
//    })
//    List<User> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "nickName", column = "nick_name"),
    })
    User getOne(Long id);
}
