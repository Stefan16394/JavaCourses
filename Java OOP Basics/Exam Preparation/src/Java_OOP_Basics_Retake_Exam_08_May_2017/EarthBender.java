package Java_OOP_Basics_Retake_Exam_08_May_2017;

public class EarthBender extends Bender {
   private double groundSaturation;

    public EarthBender(String name, int power, double groundSaturation) {
        super(name, power);
        this.groundSaturation = groundSaturation;
    }

    public double getGroundSaturation() {
        return groundSaturation;
    }

    public void setGroundSaturation(double groundSaturation) {
        this.groundSaturation = groundSaturation;
    }

    public double calculatePower()
    {
        return this.getPower()*this.groundSaturation;
    }

    @Override
    public String toString() {
        return String.format("###Earth Bender: %s, Power: %d, Ground Saturation: %.2f",this.getName(),this.getPower(),
                this.getGroundSaturation());
    }
}
