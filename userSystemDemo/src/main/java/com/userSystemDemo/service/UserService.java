package com.userSystemDemo.service;

import com.userSystemDemo.dto.UserDTO;
import com.userSystemDemo.entity.UserEntity;

import java.util.List;

public interface UserService {

     List<UserEntity> getUser();

     void addUser(UserDTO userDTO);

     void updateUserInfo(int id,String userName);

     void deleteUser(int id);
}

