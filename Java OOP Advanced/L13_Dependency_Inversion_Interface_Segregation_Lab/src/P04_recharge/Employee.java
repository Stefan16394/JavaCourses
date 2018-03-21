package P04_recharge;

public class Employee extends Worker implements Sleeper {

    public Employee(String id) {
        super(id);
    }

    public void sleep() {
        System.out.println("Employee is sleeping...");
    }

}
