package com.usermanagement.dto;

public class UserDto {

    private String userName;
    private String password;
    private String email;
    private String fullName;
    private String mobileNumber;
    private String role;
    private String gender;
    private String status;

    public UserDto() {
    }

    public UserDto(String userName, String password, String email, String fullName, String mobileNumber, String role, String gender, String status) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.role = role;
        this.gender = gender;
        this.status = status;
    }

}
