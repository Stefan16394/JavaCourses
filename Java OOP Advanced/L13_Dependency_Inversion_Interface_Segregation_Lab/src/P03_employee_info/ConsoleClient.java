package P03_employee_info;

public class ConsoleClient {
    private Formater formater;
    private InfoProvider infoProvider;

    public ConsoleClient(Formater formater, InfoProvider infoProvider) {
        this.formater = formater;
        this.infoProvider = infoProvider;
    }

    public String startFormating()
    {
       return formater.format(infoProvider.getEmployeesByName());
    }
}
