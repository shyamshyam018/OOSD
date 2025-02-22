package com.hospital.ui;
import java.util.*;
import com.hospital.models.*;
import com.hospital.services.*;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static UserService userService = new UserService();


    public static void displayMainMenu() {
        while (true) {
            System.out.println("\n--- Doctor-Patient Management System ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    userService.registerUser();
                    break;
                case 2:
                    User user = userService.loginUser();
                    if (user != null) {
                        if (user instanceof Doctor) {
                            DoctorDashboard.showMenu((Doctor) user);
                        } else if (user instanceof Patient) {
                            PatientDashboard.showMenu((Patient) user);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}