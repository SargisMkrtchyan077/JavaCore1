package medicalCenter.storage;

import medicalCenter.model.Doctor;


public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int doctorCount = 0;

    public void addDoctor(Doctor doctor) {
        if (doctorCount == doctors.length) {
            extendDoctors();
        }
        doctors[doctorCount++] = doctor;
    }

    private void extendDoctors() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        for (int i = 0; i < doctors.length; i++) {
            tmp[i] = doctors[i];
        }
        doctors = tmp;
    }

    public Doctor getDoctorById(int id) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getId() == id) {
                return doctors[i];
            }
        }
        return null;
    }

    public void deleteDoctorById(int id) {
        for (int i = 0; i < doctorCount - 1; i++) {
            doctors[id] = doctors[doctorCount - 1];
        }
        doctorCount--;
    }

    public void updateDoctor(Doctor doctor) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getId() == doctor.getId()) {
                doctors[i] = doctor;
            }

            return;
        }
    }

    public Doctor printDoctorsByProfession(String profession) {
        boolean found = false;
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getProfession().equalsIgnoreCase(profession)) {
                System.out.println(doctors[i]);
                found = true;
            }
        }
        if (!found) System.err.println("chka nman professiaov bjishk" + profession);
        return null;
    }

    public void printAllDoctors() {
        for (int i = 0; i < doctorCount; i++) {
            System.out.println(doctors[i]);
        }
    }

}
