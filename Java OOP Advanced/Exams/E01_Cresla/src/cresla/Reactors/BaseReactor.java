package cresla.Reactors;

import com.sun.org.apache.xpath.internal.operations.Mod;
import cresla.Stefko;
import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.EnergyModule;
import cresla.interfaces.Module;
import cresla.interfaces.Reactor;

import java.lang.reflect.Field;
import java.util.List;

public abstract class BaseReactor implements Reactor {
    private int id;
    private ModuleContainer moduleContainer;
    private int capacity;

    protected BaseReactor(int id, int capacity) {
        this.id = id;
        this.moduleContainer = new ModuleContainer(capacity);
        this.capacity = capacity;
    }

    @Override
    public long getTotalEnergyOutput() {
        return moduleContainer.getTotalEnergyOutput();
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return moduleContainer.getTotalHeatAbsorbing();
    }

    @Override
    public int getModuleCount() {
        return capacity;
    }

    @Override
    public void addEnergyModule(EnergyModule energyModule) {
      moduleContainer.addEnergyModule(energyModule);
    }

    @Override
    public void addAbsorbingModule(AbsorbingModule absorbingModule) {
     moduleContainer.addAbsorbingModule(absorbingModule);
    }

    @Override
    public int getId() {
        return this.id;
    }

    private int getModulesCount() throws IllegalAccessException {
        Field[] fields=this.moduleContainer.getClass().getDeclaredFields();
        for (Field field:fields)
        {
            if (field.isAnnotationPresent(Stefko.class))
            {
                field.setAccessible(true);
                List<Module> list=(List<Module>) field.get(this.moduleContainer);
                return list.size();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        try {
            return String.format("%s - %d\n" +
                    "Energy Output: %d\n" +
                    "Heat Absorbing: %d\n" +
                    "Modules: %d",this.getClass().getSimpleName(),this.getId(),this.getTotalEnergyOutput(),this.getTotalHeatAbsorbing(),getModulesCount());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
