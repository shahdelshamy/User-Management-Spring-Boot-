package com.usermanagement.service;

import com.usermanagement.dto.UserDto;
import com.usermanagement.dto.UserUpdateDto;
import com.usermanagement.lib.Status;
import com.usermanagement.model.User;

import java.util.List;

public interface UserService {

    public User addUser(UserDto userDto);

    public List<User> getAllUsers();

    public User getUserById(int id);

    public User updateUser(UserUpdateDto userDto);

    public String deleteUserById(int id);

    public String changeUserStatus(int id, Status status);

    public List<User> getUsersByRole(String role);

    public List<User> getUsersByGender(String gender);

    public List<User> getUsersByStatus(Status status);

}
