package P04_DetailPrinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Stefko"));
        List<String> docs=new ArrayList<>();
        Collections.addAll(docs,"Junglebook","DND","yo");
        employees.add(new Manager("Stevica",docs));
        DetailsPrinter dp=new DetailsPrinter(employees);
        dp.printDetails();
    }
}
