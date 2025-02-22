package com.hospital.models;

public class MedicalRecord {
    private int recordId;
    private Patient patient;
    private Doctor doctor;
    private String diagnosis;
    private String treatmentPlan;
    private String notes;

    public MedicalRecord(int recordId, Patient patient, Doctor doctor, String diagnosis, String treatmentPlan, String notes) {
        this.recordId = recordId;
        this.patient = patient;
        this.doctor = doctor;
        this.diagnosis = diagnosis;
        this.treatmentPlan = treatmentPlan;
        this.notes = notes;
    }

    public void viewMedicalRecord() {}
    public void updateMedicalRecord(String diagnosis, String treatmentPlan, String notes) {}
}
