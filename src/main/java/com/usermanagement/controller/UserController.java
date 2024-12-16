package com.usermanagement.controller;

import com.usermanagement.dto.UserDto;
import com.usermanagement.dto.UserUpdateDto;
import com.usermanagement.model.User;
import com.usermanagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //add users
    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody @Valid UserDto userDto){
        //Don't Forget ID Generation
        return ResponseEntity.ok(userService.addUser(userDto));
    }

    //Update Users
    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody @Valid  UserUpdateDto userUpdateDto){
        return ResponseEntity.ok(userService.updateUser(userUpdateDto));
    }

    //Get All users
    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    //Get user by id
    @GetMapping("/get/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        return ResponseEntity.ok(userService.getUserById(id));
    }

    //delete user by id return a String Value
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        return ResponseEntity.ok(userService.deleteUserById(id));
    }


}
