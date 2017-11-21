package Java_OOP_Basics_Retake_Exam_08_May_2017;

public class FireBender extends Bender {
   private double heatAggression;

    public FireBender(String name, int power, double heatAggression) {
        super(name, power);
        this.heatAggression = heatAggression;
    }

    public double getHeatAggression() {
        return heatAggression;
    }

    public void setHeatAggression(double heatAggression) {
        this.heatAggression = heatAggression;
    }

    public double calculatePower()
    {
        return this.getPower()*this.heatAggression;
    }

    @Override
    public String toString() {
        return String.format("###Fire Bender: %s, Power: %d, Heat Aggression: %.2f",this.getName(),this.getPower(),
                this.getHeatAggression());
    }
}

