package medicalCenter.storage;

import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;

public class PatientStorage {

    private Patient[] patients = new Patient[20];
    private int patientCount = 0;

    public void addPatient(Patient patient) {
        if (patientCount == patients.length) {
            extendPatients();
        }
        patients[patientCount++] = patient;
    }

    private void extendPatients() {
        Patient[] tmp = new Patient[patients.length + 50];
        for (int i = 0; i < patients.length; i++) {
            tmp[i] = patients[i];
        }
        patients = tmp;
    }

    public void printPatientsByDoctor(Doctor doctor) {
        boolean found = false;
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getDoctor().equals(doctor)) {
                System.out.println(patients[i]);
                found = true;
            }
        }
        if (!found) System.err.println("chka patient bjshki hamar");
    }

    public void printAllPatients() {
        for (int i = 0; i < patientCount; i++) {
            System.out.println(patients[i]);
        }
    }
}
