package cresla.Modules;

import cresla.interfaces.AbsorbingModule;

public abstract class BaseAbsorbingModule extends BaseModule implements AbsorbingModule {
    private int heatAbsorbing;

    protected BaseAbsorbingModule(int id,int heatAbsorbing) {
        super(id);
        this.heatAbsorbing=heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }

}
