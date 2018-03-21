package Java_OOP_Basics_Retake_Exam_08_May_2017;

public class AirBender extends Bender {
    private double aerialIntegrity;

    public AirBender(String name, int power, double aerialIntegrity) {
        super(name, power);
        this.aerialIntegrity = aerialIntegrity;
    }

    public double getAerialIntegrity() {
        return aerialIntegrity;
    }

    public double calculatePower()
    {
        return this.getPower()*this.aerialIntegrity;
    }

    @Override
    public String toString() {
        return String.format("###Air Bender: %s, Power: %d, Aerial Integrity: %.2f",this.getName(),this.getPower(),
                this.getAerialIntegrity());
    }
}
