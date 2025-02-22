package com.hospital.ui;

import com.hospital.models.Patient;
import com.hospital.services.AppointmentService;

import java.util.Scanner;

public class PatientDashboard {
    private static Scanner scanner = new Scanner(System.in);
    private static AppointmentService appointmentService = new AppointmentService();

    public static void showMenu(Patient user) {
        while (true) {
            System.out.println("\n--- Patient Dashboard ---");
            System.out.println("1. View Appointments");
            System.out.println("2. Request Appointment");
            System.out.println("3. View Medical Records");
            System.out.println("4. View Prescription History");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> appointmentService.viewAppointments(user);
                case 2 -> appointmentService.scheduleAppointment(user);
                case 3 -> viewMedicalRecords(user);
                case 4 -> viewPrescriptionHistory(user);
                case 5 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void viewMedicalRecords(Patient user) {
        System.out.println("Fetching medical records...");
    }

    private static void viewPrescriptionHistory(Patient user) {
        System.out.println("Fetching prescription history...");
    }
}
