package P04_Work_Force.Employees.Employees.Employees;

public class PartTimeEmployee extends BaseEmployee {

    private final int HOURS_PER_WEEK=20;

    public PartTimeEmployee(String name) {
        super(name);
    }

    @Override
    public int getHoursPerWeek() {
        return this.HOURS_PER_WEEK;
    }
}
