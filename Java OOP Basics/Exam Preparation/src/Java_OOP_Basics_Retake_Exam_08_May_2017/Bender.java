package Java_OOP_Basics_Retake_Exam_08_May_2017;

public abstract class Bender {
    private String name;
    private int power;
   

    public Bender(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    abstract double calculatePower();


}
