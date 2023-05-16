package com.work.board.user.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;


@Mapper
public interface UserDAO {

        @Insert("INSERT INTO user(user_id,password,email,create_date) VALUES(#{userId},#{password},#{email},NOW())")
        void createUser(Map<String,Object> user);

        @Select("SELECT count(*) FROM user WHERE user_id=#{username}")
        boolean selectUserId(String username);
}
