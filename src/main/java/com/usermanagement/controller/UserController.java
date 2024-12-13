package com.usermanagement.controller;

import com.usermanagement.dto.UserDto;
import com.usermanagement.model.User;
import com.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("api/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //Post Api
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody UserDto userDto){
        //Don't Forget ID Geration
        return ResponseEntity.ok(userService.addUser(userDto));
    }

    //Update Users
    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.updateUser(userDto));
    }

    //Get All users
    @GetMapping("/")
    public ResponseEntity<List<User>> updateUser(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    //Get user by id
    @GetMapping("/${id}")
    public ResponseEntity<User> updateUser(@PathVariable int id){
        return ResponseEntity.ok(userService.getUserById(id));
    }

    //Get user by id return a String Value
    @DeleteMapping("/${id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        return ResponseEntity.ok(userService.deleteUserById(id));
    }
}
