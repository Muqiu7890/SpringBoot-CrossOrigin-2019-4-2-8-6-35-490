package com.example.SpringBootRestful.controller;

import com.example.SpringBootRestful.entity.User;
import com.example.SpringBootRestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
//todo: 在下面Controller 实现一个接口满足以下要求
// 1. 实现一个Get请求,查出所有的用户信息
// 2. 接口访问地址：（/api/users）
// 3. 使用注解：@CrossOrigin实现跨域请求。
    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping("/users")
    public List<User> findUsers() {
        return userService.getAllUser();
    }

}
