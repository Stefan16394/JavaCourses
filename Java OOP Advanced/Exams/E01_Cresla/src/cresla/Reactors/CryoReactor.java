package cresla.Reactors;

public class CryoReactor extends BaseReactor {

    private int cryoProductionIndex;

    public CryoReactor(int id, int capacity,int cryoProductionIndex) {
        super(id, capacity);
        this.cryoProductionIndex=cryoProductionIndex;
    }


    @Override
    public long getTotalEnergyOutput() {
       return super.getTotalEnergyOutput()*cryoProductionIndex;
    }

}
