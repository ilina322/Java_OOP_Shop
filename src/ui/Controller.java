package ui;

import data.DataParser;
import data.EmployeeRepository;
import data.OnEventListener;
import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller implements OnEventListener {
    private final DataParser dataParser = new DataParser();
    private final ViewListener viewListener = new ViewEmployee();
    PrintMessagesEmployees printMessagesEmployees = new PrintMessagesEmployees();


    public void promptForCredentials() {
        printMessagesEmployees.printMessageForLoginEmployeeWithID();
        Scanner input = new Scanner(System.in);

        printMessagesEmployees.printMessageForLoginEmployeeWithFirstName();
        int employeeID = input.nextInt();

        printMessagesEmployees.printMessageForLoginEmployeeWithLastName();
        String employeeFirstName = input.nextLine();

        printMessagesEmployees.printMessageForLoginEmployeeWithLastName();
        String employeeLastName = input.nextLine();

        if(checkEmployeeExist(employeeID, employeeFirstName, employeeLastName)) {
            printMessagesEmployees.printMessageSuccessfulLoginEmployee();
            printMenu();
        }else{
            printMessagesEmployees.printMessageWrongLogin();
//            needs return in new choice
        }
    }

    private void printMenu() {
    }

    private boolean checkEmployeeExist(int id, String firstName, String lastName) {
        return EmployeeRepository.getInstance().provideAllEmployees().stream()
                .anyMatch(employee -> employee.employeeId() == id &&
                                      employee.firstName().equals(firstName) &&
                                      employee.lastName().equals(lastName));
     }

    @Override
    public void onRead(ArrayList<String> resultEmployeesData) {
        List<Employee> employees = dataParser.parseStringsToEmployee(resultEmployeesData);
        EmployeeRepository.getInstance().setEmployees(employees);
    }

    @Override
    public void onWrite() {
    }
}
