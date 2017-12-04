package P03_employee_info;

public class Main {

    public static void main(String[] args) {
        ConsoleClient consoleClient=new ConsoleClient(new ConsoleFormatter(),new EmployeeInfoProvider());

        String result=consoleClient.startFormating();
        System.out.println(result);
    }
}
