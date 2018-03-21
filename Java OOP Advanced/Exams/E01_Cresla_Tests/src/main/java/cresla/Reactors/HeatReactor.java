package cresla.Reactors;


public class HeatReactor extends BaseReactor {
    private int heatReductionIndex;

    public HeatReactor(int id, int capacity,int heatReductionIndex) {
        super(id, capacity);
        this.heatReductionIndex=heatReductionIndex;
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return super.getTotalHeatAbsorbing()+heatReductionIndex;
    }


}
