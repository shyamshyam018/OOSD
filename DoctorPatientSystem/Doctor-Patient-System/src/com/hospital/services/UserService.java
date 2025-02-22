package com.hospital.services;

import java.util.*;
import com.hospital.models.*;
import com.hospital.database.Database;

public class UserService {
    private Scanner scanner = new Scanner(System.in);

    public void registerUser() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter role (Doctor/Patient): ");
        String role = scanner.nextLine();

        int id = Database.generateUserId(); // Assuming Database has a method to generate unique IDs

        if (role.equalsIgnoreCase("Doctor")) {
            System.out.print("Enter specialization: ");
            String specialization = scanner.nextLine();
            Database.addUser(new Doctor(id, name, email, password, role, specialization));
        } else if (role.equalsIgnoreCase("Patient")) {
            Database.addUser(new Patient(id, name, email, role ));
        } else {
            System.out.println("Invalid role. Registration failed.");
            return;
        }
        System.out.println("Registration successful!");
    }

    public User loginUser() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = Database.findUserByEmail(email);
        if (user != null && user.password.equals(password)) {  // Use getter
            System.out.println("Login successful! Welcome " + user.name); // Use getter
            return user;
        } else {
            System.out.println("Invalid credentials. Try again.");
            return null;
        }
    }
}
