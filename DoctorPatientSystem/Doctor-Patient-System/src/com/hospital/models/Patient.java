package com.hospital.models;

import java.util.List;

public class Patient extends User {
    private List<MedicalRecord> medicalHistory;
    private List<Prescription> prescriptionHistory;

    public Patient(int id, String name, String email, String password) {
        super(id, name, email, password, "Patient");
    }

    public void requestAppointment(Doctor doctor, String date) {}
    public void viewPrescriptions() {}
    public void makePayment(Billing bill) {}

    @Override
    public void viewProfile() {}
}