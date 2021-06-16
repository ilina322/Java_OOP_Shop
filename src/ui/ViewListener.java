package ui;

public interface ViewListener {
    
    void printEmployee(int employeeID, String firstName, String lastName);

    void printError();
}
