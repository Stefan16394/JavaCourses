package P04_recharge;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("123");
        Robot robot = new Robot("007",100);
        robot.setCurrentPower(34);
        robot.work(10);
        employee.work(10);
        System.out.println(employee.getWorkingHours());
        RechargeStation rs=new RechargeStation();
        rs.recharge(robot);
        System.out.println(robot.getCurrentPower());

    }
}
