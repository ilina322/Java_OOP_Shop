package ui;

import data.EmployeeRepository;
import model.Employee;
import ui.printsForEmployee.PrintMenu;
import ui.printsForEmployee.PrintMessagesEmployees;

import java.util.Comparator;
import java.util.Scanner;

public class MenuManager {
    private final PrintMessagesEmployees printMessagesEmployees = new PrintMessagesEmployees();
    private final LoginMenu loginMenu = new LoginMenu();
    private final PrintMenu printMenu = new PrintMenu();

    void chooseOptionFromMenu() {
        byte option;
        Scanner input = new Scanner(System.in);
        do {
            printMenu.EmployeeMenu();
            option = input.nextByte();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    printMessagesEmployees.printMessageTypeOfSortingEmployees();
                    chooseTypeSortingEmployee();
                    break;
                case 14:
                    loginMenu.showFirstMenuOptions();
                default:
                    printMessagesEmployees.printMessageError();
            }
        } while (option != 14);
    }


    public void chooseTypeSortingEmployee() {
        Scanner scanner = new Scanner(System.in);
        byte option = scanner.nextByte();
        switch (option) {
            case 1:
                sortEmployeeByName();
                break;
            case 2:
                sortEmployeeBySalary();
                break;
            default:System.out.println("Choose 1 or 2");
                chooseTypeSortingEmployee();
        }
    }

    private void sortEmployeeBySalary() {
        EmployeeRepository.getInstance().provideAllEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::salary))
                .forEach(System.out::println);
    }

    private void sortEmployeeByName() {
        EmployeeRepository.getInstance().provideAllEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::firstName))
                .forEach(System.out::println);
    }

}
