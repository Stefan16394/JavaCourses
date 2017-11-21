package P03_Mankind;

public class Worker extends Human {
    private double salary;
    private double workingHours;

    public Worker(String firstName, String lastName, double salary, double workingHours) {
        super(firstName, lastName);
        setSalary(salary);
        setWorkingHours(workingHours);
    }

    @Override
    public void setLastName(String lastName) {
        if (lastName.length()<3)
        {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<10)
        {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salary = salary;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        if (workingHours<1 || workingHours>12)
        {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workingHours = workingHours;
    }

    @Override
    public String toString(){
        return String.format("First Name: %s\n" +
                "Last Name: %s\n" +
                "Week Salary: %.2f\n" +
                "Hours per day: %.2f\n" +
                "Salary per hour: %.2f\n",getFirstName(),getLastName(),getSalary(),getWorkingHours()
        ,getSalary()/7.00/getWorkingHours());
    }
}
