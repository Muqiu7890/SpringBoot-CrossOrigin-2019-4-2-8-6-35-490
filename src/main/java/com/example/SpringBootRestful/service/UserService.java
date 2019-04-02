package com.example.SpringBootRestful.service;

import com.example.SpringBootRestful.data.UserData;
import com.example.SpringBootRestful.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private List<User> userData = UserData.userData();

    public List<User> getAllUser() {
        return userData;
    }
}
