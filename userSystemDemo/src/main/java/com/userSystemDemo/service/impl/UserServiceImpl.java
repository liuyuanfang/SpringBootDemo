package com.userSystemDemo.service.impl;

import com.userSystemDemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "hello User";
    }
}
