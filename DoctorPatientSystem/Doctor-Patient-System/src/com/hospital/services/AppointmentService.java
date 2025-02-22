package com.hospital.services;
import com.hospital.database.Database;
import com.hospital.models.*;

import javax.xml.crypto.Data;
import java.util.*;


public class AppointmentService {

    private static int appointmentCounter = 0;
    private Scanner scanner = new Scanner(System.in);

    public void scheduleAppointment(Patient patient) {
        System.out.println("\n--- Schedule an Appointment ---");
        List<User> users = Database.users;
        int i = 1;
        for (User user : users) {
            if(user instanceof Doctor ) {
                System.out.println((i+1) + ". " + user.name + "Speciality : " + user.role);
            }
        }
        System.out.print("Select a doctor (Enter number): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 1 || choice > users.size() || !(users.get(choice - 1) instanceof Doctor)) {
            System.out.println("Invalid choice.");
            return;
        }
        Doctor selectedDoctor = (Doctor) users.get(choice-1);
        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        for (Appointment app : Database.appointments) {
            if (app.getDoctor().equals(selectedDoctor) && app.getDate().equals(date)) {
                System.out.println("Doctor is already booked for this date. Try another date.");
                return;
            }
        }

        Appointment appointment = new Appointment(appointmentCounter++, patient, selectedDoctor, date);
        Database.appointments.add(appointment);
        appointment.setStatus("Initiated");
        System.out.println("✅ Appointment scheduled successfully with Dr. " + selectedDoctor.name + " on " + date);


    }

    public void viewAppointments(Patient patient) {
        List<Appointment> appointments = Database.appointments;
        for(Appointment appointment : appointments) {
            if(appointment.getPatient().equals(patient) && !appointment.getStatus().equals("Completed")) {
                System.out.println("ID - "  + appointment.getAppointmentId() + " Doctor - " + appointment.getDoctor().name + " Date - " + appointment.getDate() + " Status - " + appointment.getStatus() );
            }
        }
    }
}


