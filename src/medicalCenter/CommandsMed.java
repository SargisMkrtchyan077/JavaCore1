package medicalCenter;

public interface CommandsMed {

        String EXIT = "0";
        String ADD_DOCTOR = "1";
        String SEARCH_DOCTOR_BY_PROFESSION = "2";
        String DELETE_DOCTOR_BY_ID = "3";
        String PRINT_ALL_DOCTOR = "4";
        String CHANGE_DOCTOR_BY_ID = "5";
        String ADD_PATIENT = "6";
        String PRINT_ALL_PATIENTS_BY_DOCTOR = "7";
        String PRINT_ALL_PATIENT = "8";

        static void printDoctorAndPatientCommands() {
            System.out.println("Please input " + EXIT + " for EXIT");
            System.out.println("Please input " + ADD_DOCTOR + " for ADD_DOCTOR");
            System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH_DOCTOR_BY_PROFESSION");
            System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for DELETE_DOCTOR_BY_ID");
            System.out.println("Please input " + PRINT_ALL_DOCTOR + " for PRINT_ALL_DOCTOR");
            System.out.println("Please input " + CHANGE_DOCTOR_BY_ID + " for CHANGE_DOCTOR_BY_ID");
            System.out.println("Please input " + ADD_PATIENT + " for ADD_PATIENT");
            System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for PRINT_ALL_PATIENTS_BY_DOCTOR");
            System.out.println("Please input " + PRINT_ALL_PATIENT + " for PRINT_ALL_PATIENT");
        }
    }
