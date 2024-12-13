package com.usermanagement.service;

import com.usermanagement.dto.UserDto;
import com.usermanagement.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    //1 for El-Seginy
    @Override
    public User addUser(UserDto userDto) {
        //Don't Forget the Id
        return null;
    }

    //2 for El-fiky
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    //3 for El-fiky
    @Override
    public User getUserById(int id) {
        return null;
    }

    //4 for Shahd
    @Override
    public User updateUser(UserDto userDto) {
        return null;
    }

    //5 for Nada
    @Override
    public String deleteUserById(int id) {
        return "";
    }

}
