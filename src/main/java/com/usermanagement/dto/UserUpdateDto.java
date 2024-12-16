package com.usermanagement.dto;

import jakarta.validation.constraints.*;

public class UserUpdateDto {

    @NotNull
    private int id;

    @NotNull(message = "You must enter the username")
    private String userName;

    @NotNull(message = "You must enter the password")
    @Pattern(regexp = "^[A-Za-z]+\\d{2}$", message = "Password must contain letters in begin and two digits in end")
    private String password;

    @NotNull(message = "You must enter your email")
    @Email(message = "Your mail not valid")
    private String email;

    @NotNull(message = "You must enter your phone number")
    @Pattern(regexp = "^\\d{11}$",message = "The phone number not correct")
    private String mobileNumber;

    @NotNull(message = "You must enter your phone number")
    private String role;

    @NotNull(message = "You must enter your status")
    private String status;


    public UserUpdateDto() {
    }

    public UserUpdateDto(int id, String userName, String password, String email, String mobileNumber, String role, String status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.role = role;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
