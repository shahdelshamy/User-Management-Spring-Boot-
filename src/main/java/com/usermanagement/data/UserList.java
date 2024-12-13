package com.usermanagement.data;

import com.usermanagement.model.User;

import java.util.Arrays;
import java.util.List;

public class UserList {

    List<User> UserList = Arrays.asList(

            new User(1, "john_doe", "password123", "john.doe@example.com",
                    "John Doe", "1234567890", "Admin", "Male", "Active"),

            new User(2, "jane_doe", "securePass!@#", "jane.doe@example.com",
                    "Jane Doe", "0987654321", "User", "Female", "Inactive"),

            new User(3, "alex_smith", "alexPass2024", "alex.smith@example.com",
                    "Alex Smith", "5678901234", "Moderator", "Male", "Pending")
    );

}
