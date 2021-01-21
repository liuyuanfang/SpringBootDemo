package com.userSystemDemo.service.impl;

import com.userSystemDemo.dto.UserDTO;
import com.userSystemDemo.entity.UserEntity;
import com.userSystemDemo.mapper.UserMapper;
import com.userSystemDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserEntity> getUser() {
        return userMapper.getUser();
    }

    @Override
    public void addUser(UserDTO userDTO){
        String userName = userDTO.getUserName();
        String pwd = userDTO.getPwd();

        System.out.printf(userName + "----" + pwd);

        userMapper.addUser(userName,pwd);
    }

    @Override
    public void updateUserInfo(int id,String userName){
        System.out.printf(userName);

        userMapper.updateUser(id,userName);

    }

    @Override
    public void deleteUser(int id){
        userMapper.deleteUser(id);
    }
}

