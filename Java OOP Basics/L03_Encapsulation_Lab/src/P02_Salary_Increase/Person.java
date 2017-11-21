package P02_Salary_Increase;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void increaseSalary(int amount)
    {
        if (this.age>30)
        {
            this.salary+=this.salary*amount/100.00;
        }
        else
        {
            this.salary+=this.salary*(amount/2.00)/100.00;
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s %s gets %s leva",this.firstName,this.lastName,this.salary);
    }
}
