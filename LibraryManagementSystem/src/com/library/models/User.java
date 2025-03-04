package com.library.models;

public class User {
    protected String username;
    protected String password;
    protected String role; // "admin" or "member"

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User: " + username + " (" + role + ")";
    }
}
