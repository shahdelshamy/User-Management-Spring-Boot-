package com.usermanagement.data;

import com.usermanagement.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    private static List<User> users = new ArrayList<>(
            List.of(
                    new User("Ahmed", "password123", "Ahmed@example.com",
                            "Ahmed Elsigeny", "1234567890", "Admin", "Male", "Active"),

                    new User("Mahmoud", "securePass!@#", "Mahmoud@example.com",
                            "Mahmoud Khalad", "0987654321", "User", "Male", "Inactive"),

                    new User("Shahd", "alexPass2024", "shahd@example.com",
                            "Shahd AbdelNaby", "5678901234", "Moderator", "Female", "Pending"),

                     new User("Nada", "alexPass2024", "Nada@example.com",
                                      "Nada Ezzat", "5678901234", "Moderator", "Female", "Pending")
            ));


    public static List<User> getUsers() {
        return users;
    }


}
