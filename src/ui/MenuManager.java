package ui;

import ui.printsForEmployee.PrintMenu;
import ui.printsForEmployee.PrintMessagesEmployees;

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
                    break;
                case 14:
                    loginMenu.showFirstMenuOptions();
                default:
                    printMessagesEmployees.printMessageError();
            }
        } while (option != 14);
    }
}
