package com.userSystemDemo.controller;


import com.userSystemDemo.dto.UserDTO;
import com.userSystemDemo.entity.UserEntity;
import com.userSystemDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// /usr/local/MySQL/bin/mysql -u root -p


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

//    @RequestBody 获得请求体
//    @RequestParam 获得?URL请求头参数值
    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
        return new ResponseEntity( HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody UserEntity userEntity){
        int id = userEntity.getId();
        String userName = userEntity.getUserName();
        String pwd = userEntity.getPwd();

        userService.updateUserInfo(id,userName);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getUser(){
        List getALluser = userService.getUser();
        return new ResponseEntity(getALluser, HttpStatus.OK);
    }

//    @PathVariable 获得URL路径参数
    @DeleteMapping("/{id}")
    public ResponseEntity<?>  deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return new ResponseEntity( HttpStatus.OK);
    }
}
