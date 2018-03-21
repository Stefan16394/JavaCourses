package P04_Work_Force.Employees.Employees.Employees;

public abstract class BaseEmployee {
    private String name;

    public BaseEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getHoursPerWeek();
}
