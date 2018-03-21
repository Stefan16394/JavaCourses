package P03_Validation_Data;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length()>=3) {
            this.firstName = firstName;
        }
        else
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length()>=3) {
            this.lastName = lastName;
        }
        else
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0)
        {
            this.age = age;
        }
        else
            throw new IllegalArgumentException("Age cannot be zero or negative integer");

    }

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>460)
        {
            this.salary = salary;
        }
        else
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");

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