package com.library.services;
import com.library.database.UserDAO;
import com.library.models.User;


public class AuthService {
    private UserDAO userDAO;

    public AuthService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User login(String username , String password){
        User user = userDAO.getUserByUsername(username);
        if(user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean register(String username, String password, String role) {
        if(userDAO.getUserByUserName(username) == null){
            userDAO.addUser(new User(username , password , role));
            return true;
        }
        return false;
    }
}
