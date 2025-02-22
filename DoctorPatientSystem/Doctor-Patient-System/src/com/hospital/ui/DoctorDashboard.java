package com.hospital.ui;
import com.hospital.models.Doctor;
import java.util.*;

public class DoctorDashboard {
    public static void showMenu(Doctor user) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Doctor Dashboard ---");
            System.out.println("1. View Appointments");
            System.out.println("2. Manage Medical Records");
            System.out.println("3. Create Prescriptions");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            if (choice == 4) break;
        }
    }
}

