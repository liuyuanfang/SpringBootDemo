package com.userSystemDemo.mapper;

import com.userSystemDemo.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<UserEntity> getUser();

    @Insert("insert into user(username,pwd) values(#{username},#{pwd})")
    void addUser(@Param("username") String username,
                 @Param("pwd") String pwd);

    //  UPDATE tableName SET key='学习 C++' WHERE id=3;
    @Update("update user set username=#{username} where id=#{id}")
    void updateUser(@Param("id") int id,@Param("username") String userName);

    @Delete("delete from user where id=#{id}")
    void deleteUser(@Param("id") int id);
}
