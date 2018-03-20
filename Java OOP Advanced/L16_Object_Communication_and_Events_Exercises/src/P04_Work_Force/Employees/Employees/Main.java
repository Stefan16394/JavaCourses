package P04_Work_Force.Employees.Employees;

import P04_Work_Force.Employees.Employees.Employees.BaseEmployee;
import P04_Work_Force.Employees.Employees.Employees.PartTimeEmployee;
import P04_Work_Force.Employees.Employees.Employees.StandartEmployee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Subject subject=new Subject();
        EmployeeDatabase ed=new EmployeeDatabase();

        while (true)
        {
            String[] input=sc.nextLine().split("\\s+");
            switch (input[0])
            {
                case "End":
                    return;
                case "Job":
                    Observer job=new Job(ed.getEmployees().get(input[3]),input[1],Integer.valueOf(input[2]));
                    subject.addObserver(job);
                    break;
                case "StandartEmployee":
                    BaseEmployee standartEmployee=new StandartEmployee(input[1]);
                    ed.getEmployees().put(input[1],standartEmployee);
                    break;
                case "PartTimeEmployee":
                    BaseEmployee partTimeEmployee=new PartTimeEmployee(input[1]);
                    ed.getEmployees().put(input[1],partTimeEmployee);
                    break;
                case "Pass":
                    subject.passWeek();
                    break;
                case "Status":
                    subject.status();
                    break;
            }
        }
    }
}
