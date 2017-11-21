package Java_OOP_Basics_Retake_Exam_08_May_2017;

public class AirMonument extends Monument {
    private int airAffinity;

    public AirMonument(String name, int airAffinity) {
        super(name);
        this.airAffinity = airAffinity;
    }

    public int getAirAffinity() {
        return airAffinity;
    }

    @Override
    public int afinity() {
        return this.airAffinity;
    }
    @Override
    public String toString() {
        return String.format("###Air Monument: %s, Air Affinity: %d",this.getName(),this.getAirAffinity());
    }
}
