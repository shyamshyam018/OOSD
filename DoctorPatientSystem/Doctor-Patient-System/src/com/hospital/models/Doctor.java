package com.hospital.models;

import java.util.List;

public class Doctor extends User{
    private String specialization;
    private List<Patient> patients;
    public Doctor(int id , String name , String email , String password ,String role ,String specialization ){
        super(id,name,email,password,"Doctor");
        this.specialization = specialization;
    }
    public void viewAppointments(){}
    public void addMedicalRecord(Patient patient , MedicalRecord medicalRecord){}
    public void createPrescription(Patient patient , Prescription prescription){}
    public void generateBill(Patient patient , Billing bill){}
    @Override
    public void viewProfile(){}
}
