package Java_OOP_Basics_Retake_Exam_08_May_2017;

public class EarthMonument extends Monument {
    private int earthAffinity;

    public EarthMonument(String name, int earthAffinity) {
        super(name);
        this.earthAffinity = earthAffinity;
    }

    public int getEarthAffinity() {
        return earthAffinity;
    }

    public void setEarthAffinity(int earthAffinity) {
        this.earthAffinity = earthAffinity;
    }

    @Override
    public int afinity() {
        return this.earthAffinity;
    }
    @Override
    public String toString() {
        return String.format("###Earth Monument: %s, Earth Affinity: %d",this.getName(),this.getEarthAffinity());
    }
}
