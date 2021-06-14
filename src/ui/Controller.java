package ui;

import data.DataParser;
import data.OnEventListener;

import java.util.ArrayList;

public class Controller implements OnEventListener {
    private final DataParser dataParser = new DataParser();

    @Override
    public void onRead(ArrayList<String> resultEmployeesData) {
        dataParser.parseStringsToEmployee(resultEmployeesData);

    }

    @Override
    public void onWrite() {

    }
}
