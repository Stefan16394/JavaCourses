package P04_Work_Force.Employees.Employees;

import P04_Work_Force.Employees.Employees.Employees.BaseEmployee;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeDatabase {
    private Map<String,BaseEmployee> employees;

    public EmployeeDatabase() {
        this.employees = new LinkedHashMap<>();
    }

    public Map<String, BaseEmployee> getEmployees() {
        return employees;
    }
}
