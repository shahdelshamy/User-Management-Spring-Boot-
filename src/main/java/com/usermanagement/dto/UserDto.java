package com.usermanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserDto {

    @NotNull(message = "You must enter the username")
    private String userName;

    @NotNull(message = "You must enter the password")
    @Pattern(regexp = "^[A-Za-z]+\\d{2}$", message = "Password must contain letters in begin and two digits in end")
    private String password;

    @NotNull(message = "You must enter your email")
    @Email(message = "Your mail not valid")
    private String email;

    @NotNull(message = "You must enter your full name")
    private String fullName;

    @NotNull(message = "You must enter your mobile number")
    @Pattern(regexp = "^\\d{11}$",message = "The phone number not correct")
    private String mobileNumber;

    @NotNull(message = "You must enter your role")
    private String role;

    @NotNull(message = "You must enter your gender")
    private String gender;

    @NotNull(message = "You must enter your status")
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
