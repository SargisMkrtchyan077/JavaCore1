package employee;

public interface EmployeeImpl {

    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEES = "2";
    String SEARCH_EMPLOYEE_BY_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";

    static void printEmployees() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for ADD_EMPLOYEE");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEES + " for PRINT_ALL_EMPLOYEES");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for SEARCH_EMPLOYEE_BY_ID");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " for SEARCH_EMPLOYEE_BY_COMPANY_NAME");


    }


}
