package com.usermanagement.model;

import com.usermanagement.lib.Status;

public class User {

    private static int LastID = 1;
    private int id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private String mobileNumber;
    private String role;
    private String gender;
    private Status status;

    public User() {
        this.id = LastID++;
    }


    public User(String userName, String password, String email, String fullName, String mobileNumber, String role, String gender, Status status) {
        this.id = LastID++;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.role = role;
        this.gender = gender;
        this.status = status;
    }

    public static int getLastID() {
        return LastID;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
