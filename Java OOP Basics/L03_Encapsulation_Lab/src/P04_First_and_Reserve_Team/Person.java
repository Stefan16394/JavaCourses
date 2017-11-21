package P04_First_and_Reserve_Team;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public int getAge() {
        return age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
}
