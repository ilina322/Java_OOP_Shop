package ui;

import data.DataParser;
import data.EmployeeRepository;
import data.OnEventListener;
import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Controller implements OnEventListener {
    private final DataParser dataParser = new DataParser();

    @Override
    public void onRead(ArrayList<String> resultEmployeesData) {
        List<Employee> employees = dataParser.parseStringsToEmployee(resultEmployeesData);
        EmployeeRepository.getInstance().setEmployees(employees);
    }

    @Override
    public void onWrite() {
    }
}
