package data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {
    String fileNameRead = "EmployeeData.csv";
    private final OnEventListener eventListener;

    public FileManager(OnEventListener eventListener) {
        this.eventListener = eventListener;
    }

    public void readEmployeesDataFile() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ArrayList<String> resultEmployeesData = readEmployeeData();
                eventListener.onRead(resultEmployeesData);
            }
        }).start();
    }

    public void writeChangedFile(String text) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                write(text);
                eventListener.onWrite();
            }
        }).start();
    }

    private ArrayList<String> readEmployeeData() {
        ArrayList<String> arrayList = new ArrayList<>();

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(fileNameRead))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                arrayList.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Exception while reading the file was thrown");
            System.out.println(e.getMessage());
        }
        return arrayList;
    }

    private void write (String text) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(fileNameRead))) {
            bufferedWriter.write(text);

        } catch (IOException e) {
            System.out.println("Exception while reading the file was thrown");
            System.out.println(e.getMessage());
        }
    }

}
