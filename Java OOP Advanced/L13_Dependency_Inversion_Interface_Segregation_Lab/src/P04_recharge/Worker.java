package P04_recharge;

public abstract class Worker  {

    private String id;
    private int workingHours;

    public Worker(String id) {
        this.id = id;
    }

    public void work(int hours) {
        this.workingHours += hours;
    }

    public int getWorkingHours() {
        return workingHours;
    }
}
