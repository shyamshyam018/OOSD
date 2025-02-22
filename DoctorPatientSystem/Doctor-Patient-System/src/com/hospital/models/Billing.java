package com.hospital.models;

public class Billing {
    private int billId;
    private Patient patient;
    private Doctor doctor;
    private double amount;
    private String status; // "Pending", "Paid"

    public Billing(int billId, Patient patient, Doctor doctor, double amount) {
        this.billId = billId;
        this.patient = patient;
        this.doctor = doctor;
        this.amount = amount;
        this.status = "Pending";
    }

    public void generateBill() {}
    public void makePayment(double amount) {}
}
