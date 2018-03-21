package Java_OOP_Basics_Retake_Exam_08_May_2017;

public class WaterMonument extends Monument {
    private int waterAffinity;

    public WaterMonument(String name, int waterAffinity) {
        super(name);
        this.waterAffinity = waterAffinity;
    }

    public int getWaterAffinity() {
        return waterAffinity;
    }

    public void setWaterAffinity(int waterAffinity) {
        this.waterAffinity = waterAffinity;
    }

    @Override
    public int afinity() {
        return this.waterAffinity;
    }
    @Override
    public String toString() {
        return String.format("###Water Monument: %s, Water Affinity: %d",this.getName(),this.getWaterAffinity());
    }
}
