package P04_Work_Force.Employees.Employees;

import P04_Work_Force.Employees.Employees.Employees.BaseEmployee;

public class Job implements Observer{
    private BaseEmployee employee;
    private String name;
    private int hoursRequired;

    public Job(BaseEmployee employee, String name, int hoursRequired) {
        this.employee = employee;
        this.name = name;
        this.hoursRequired = hoursRequired;
    }

    @Override
    public void update() {
        this.hoursRequired-=employee.getHoursPerWeek();
    }

    public String getName() {
        return this.name;
    }

    public int getHoursRequired() {
        return this.hoursRequired;
    }
}
