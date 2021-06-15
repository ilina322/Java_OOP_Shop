package model;

public class Employee {
//    employee_id,first_name,last_name,age,salary

    private int employeeID;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(int employeeID, String firstName, String lastName, int age, double salary) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}