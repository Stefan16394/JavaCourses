package cresla.Modules;


public class CooldownSystem extends BaseAbsorbingModule  {

    public CooldownSystem(int id, int heatAbsorbing) {
        super(id, heatAbsorbing);
    }

    @Override
    public String toString() {
        return String.format("CooldownSystem Module - %d\n" +
                "Heat Absorbing: %d",this.getId(),this.getHeatAbsorbing());
    }
}
