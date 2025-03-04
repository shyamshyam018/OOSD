package com.library.models;

public class Librarian extends User {
    public Librarian(String username , String password) {
        super(username , password , "Librarian");
    }

    @Override
    public String toString() {
        return "Librarian : " + username;
    }
}
