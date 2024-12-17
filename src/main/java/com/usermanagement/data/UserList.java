package com.usermanagement.data;

import com.usermanagement.lib.Status;
import com.usermanagement.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    Status s;
    private static List<User> users = new ArrayList<>(
            List.of(
                    new User("Ahmed", "password123", "Ahmed@example.com",
                            "Ahmed Elsigeny", "1234567890", "Admin", "Male", Status.Active),

                    new User("Mahmoud", "securePass!@#", "Mahmoud@example.com",
                            "Mahmoud Khalad", "0987654321", "User", "Male", Status.Inactive),

                    new User("Shahd", "alexPass2024", "shahd@example.com",
                            "Shahd AbdelNaby", "5678901234", "Moderator", "Female", Status.Active),

                     new User("Nada", "alexPass2024", "Nada@example.com",
                                      "Nada Ezzat", "5678901234", "Moderator", "Female", Status.Inactive)
            ));


    public static List<User> getUsers() {
        return users;
    }

    public static int searchByID (int targetId){

        int left = 0;
        int right = users.size() - 1;
        int userIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            User midObject = users.get(mid);

            if (midObject.getId() == targetId) {
                userIndex = mid;
                break; // Found
            }
            if (midObject.getId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return userIndex;
    }

}
