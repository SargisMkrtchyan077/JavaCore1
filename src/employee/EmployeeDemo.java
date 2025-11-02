package employee;

import model.Employee;
import employee.Storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements EmployeeImpl {

    private static final EmployeeStorage employeeStorage = new EmployeeStorage();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            EmployeeImpl.printEmployees();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    System.out.println("Please input EmployeeID");
                    String employeeID = scanner.nextLine();
                    Employee employee = employeeStorage.searchEmployeeByEmployeeID(employeeID);
                    System.out.println(employee);
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    System.out.println("Please input company name");
                    String company = scanner.nextLine();
                    Employee companyName = employeeStorage.searchEmployeeByCompanyName(company);
                    System.out.println(companyName);
                    break;
            }
        }
    }

    private static void addEmployee() {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname ");
        String surname = scanner.nextLine();
        System.out.println("Please input employeeID");
        String employeeID = scanner.nextLine();
        System.out.println("Please input salary");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input company");
        String company = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, employeeID, salary, company, position);
        employeeStorage.addEmployee(employee);
        System.out.println("employee added successfully");
    }
}
