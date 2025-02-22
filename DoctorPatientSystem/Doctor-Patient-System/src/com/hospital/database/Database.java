package com.hospital.database;
import com.hospital.models.*;
import java.util.*;


public class Database {
    public static List<User> users = new ArrayList<>();
    public static List<Appointment> appointments = new ArrayList<>();
    public static List<MedicalRecord> medicalRecords = new ArrayList<>();
    public static List<Prescription> prescriptions = new ArrayList<>();
    public static List<Billing> billings = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static int generateUserId(){
        return 1;
    }

    public static User findUserByEmail(String email) {
        for (User user : users) {
            if (user.email.equals(email)) return user;
        }
        return null;
    }

    public static void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
