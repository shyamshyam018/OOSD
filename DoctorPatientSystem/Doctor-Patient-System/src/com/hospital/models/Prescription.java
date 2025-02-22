package com.hospital.models;
import java.util.List;

    public class Prescription {
        private int prescriptionId;
        private Patient patient;
        private Doctor doctor;
        private List<String> medications;
        private List<String> dosage;
        private String notes;

        public Prescription(int prescriptionId, Patient patient, Doctor doctor) {
            this.prescriptionId = prescriptionId;
            this.patient = patient;
            this.doctor = doctor;
        }

        public void viewPrescription() {}
        public void addMedication(String medicine, String dosage) {}
    }
