package com.hospital.models;

public abstract class User {
    public int id;
    public String name;
    public String email;
    public String password;
    public String role;
    public User(int id , String name , String email , String password , String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public abstract void viewProfile();
    public void login(){};
    public void logout(){};
}
