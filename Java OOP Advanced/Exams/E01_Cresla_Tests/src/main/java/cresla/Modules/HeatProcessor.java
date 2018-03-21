package cresla.Modules;


public class HeatProcessor extends BaseAbsorbingModule {

    public HeatProcessor(int id, int heatAbsorbing) {
        super(id, heatAbsorbing);
    }

    @Override
    public String toString() {
        return String.format("HeatProcessor Module - %d\n" +
                "Heat Absorbing: %d",this.getId(),this.getHeatAbsorbing());
    }
}
