package com.hospital.models;


public class Appointment {
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String status; // "Scheduled", "Completed", "Cancelled"

    public Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.status = "Scheduled";
    }

    // getters and setters
    public int getAppointmentId() { return appointmentId; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public String getDate() { return date; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void scheduleAppointment() {}
    public void cancelAppointment() {}
    public void rescheduleAppointment(String newDate) {}
}
