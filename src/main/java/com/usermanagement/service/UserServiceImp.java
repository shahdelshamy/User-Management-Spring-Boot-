package com.usermanagement.service;


import com.usermanagement.data.UserList;
import com.usermanagement.dto.UserDto;
import com.usermanagement.dto.UserUpdateDto;
import com.usermanagement.mapper.UserMapper;
import com.usermanagement.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override public User addUser(UserDto userDto) {

        /*
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setFullName(userDto.getFullName());
        user.setMobileNumber(userDto.getMobileNumber());
        user.setRole(userDto.getRole());
        user.setGender(userDto.getGender());
        user.setStatus(userDto.getStatus());

      //  user.setId((int) idCounter.incrementAndGet());
        user.setId(user.getLastID());
        userList.users.add(user);
       */

        User user = userMapper.UserDtoMapToUser(userDto);
        UserList.getUsers().add(user);
        return user;
    }


    @Override
    public List<User> getAllUsers() {

        return UserList.getUsers();
    }


    @Override
    public User getUserById(int id) {
        return null;
    }


    @Override
    public User updateUser(UserUpdateDto userUpdateDto) {

        for (User user : UserList.getUsers()) {
            if (user.getId() == userUpdateDto.getId()) {
                userMapper.UpdateDtoMapToUser(userUpdateDto, user); // Use mapper to update fields
                return user;
            }
        }
        return null; // Return null if the user is not found
    }



    @Override
    public String deleteUserById(int id) {
        return "";
    }

}
