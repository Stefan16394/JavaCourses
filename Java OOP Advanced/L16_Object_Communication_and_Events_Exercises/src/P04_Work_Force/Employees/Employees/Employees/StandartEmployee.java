package P04_Work_Force.Employees.Employees.Employees;

public class StandartEmployee extends BaseEmployee {

    private final int HOURS_PER_WEEK=40;

    public StandartEmployee(String name) {
        super(name);
    }

    @Override
    public int getHoursPerWeek() {
        return this.HOURS_PER_WEEK;
    }
}
