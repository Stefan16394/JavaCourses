package Java_OOP_Basics_Retake_Exam_08_May_2017;

public class WaterBender extends Bender {
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.waterClarity = waterClarity;
    }

    public double getWaterClarity() {
        return waterClarity;
    }

    public void setWaterClarity(double waterClarity) {
        this.waterClarity = waterClarity;
    }

    public double calculatePower()
    {
        return this.getPower()*this.waterClarity;
    }

    @Override
    public String toString() {
        return String.format("###Water Bender: %s, Power: %d, Water Clarity: %.2f",this.getName(),this.getPower(),
                this.getWaterClarity());
    }
}
