package com.usermanagement.service;


import com.usermanagement.data.UserList;
import com.usermanagement.dto.UserDto;
import com.usermanagement.dto.UserUpdateDto;
import com.usermanagement.enums.Status;
import com.usermanagement.mapper.UserMapper;
import com.usermanagement.model.User;
// import jakarta.validation.Valid;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
// import java.util.concurrent.atomic.AtomicLong;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;


    @PostConstruct
    public void init() {
        System.out.println("Initializing user list...");
        UserList.getUsers();
        /*
        for (User user : UserList.getUsers()) {
            System.out.println("Loaded user: " + user.getUserName());
        }
         */
    }


    @Override
    public User addUser(UserDto userDto) {

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
      //user.setId((int) idCounter.incrementAndGet());
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

        User retUser;
        int userIndex = UserList.searchByID(id);

        if(userIndex == -1){
            retUser = null;
        }
        else{
            retUser = UserList.getUsers().get(userIndex);
        }

        return retUser;
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

        String retMsg;
        int userIndex = UserList.searchByID(id);

        if(userIndex == -1){
            retMsg = "User not found";
        }
        else{
            UserList.getUsers().remove(userIndex);
            retMsg = "User Deleted Successfully";
        }

        return retMsg;
    }

    @Override
    public String changeUserStatus(int id, Status status) {

        String retMsg;
        int userIndex = UserList.searchByID(id);

        if(userIndex == -1){
            retMsg = "User not found";
        }
        else{
            UserList.getUsers().get(userIndex).setStatus(status);
            if (status == Status.Active){
                retMsg = "User Activated Successfully";
            }
            else{
                retMsg = "User Deactivated Successfully";
            }
        }

        return retMsg;
    }

    @Override
    public List<User> getUsersByRole(String role) {

        List<User> retUsers = new ArrayList<>();

        for (User user : UserList.getUsers()) {
            if (user.getRole().equals(role)) {
                retUsers.add(user);
            }
        }

        return retUsers;
    }

    @Override
    public List<User> getUsersByGender(String gender) {

        List<User> retUsers = new ArrayList<>();

        for (User user : UserList.getUsers()) {
            if (user.getGender().equals(gender)) {
                retUsers.add(user);
            }
        }

        return retUsers;
    }

    @Override
    public List<User> getUsersByStatus(Status status) {
        List<User> retUsers = new ArrayList<>();

        for (User user : UserList.getUsers()) {
            if (user.getStatus() == status) {
                retUsers.add(user);
            }
        }

        return retUsers;
    }

}
