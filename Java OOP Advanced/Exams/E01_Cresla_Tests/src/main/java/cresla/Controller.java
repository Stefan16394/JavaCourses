package cresla;

import cresla.Modules.CooldownSystem;
import cresla.Modules.CryogenRod;
import cresla.Modules.HeatProcessor;
import cresla.Reactors.CryoReactor;
import cresla.Reactors.HeatReactor;
import cresla.interfaces.*;

import java.util.LinkedHashMap;
import java.util.List;

public class Controller implements Manager {
    private LinkedHashMap<Integer,Identifiable> allParts;
    private LinkedHashMap<Integer,Reactor> reactors;
    private int ID=1;

    public Controller() {
        this.allParts=new LinkedHashMap<>();
        this.reactors=new LinkedHashMap<>();
    }

    @Override
    public String reactorCommand(List<String> arguments) {
       String type=arguments.get(0);
       Integer aditionalParameter=Integer.valueOf(arguments.get(1));
       Integer moduleCapacity=Integer.valueOf(arguments.get(2));

        Reactor reactor = null;
       switch (type)
       {
           case "Cryo":
               reactor=new CryoReactor(ID,moduleCapacity,aditionalParameter);
               break;
           case "Heat":
               reactor=new HeatReactor(ID,moduleCapacity,aditionalParameter);
               break;
       }
       allParts.put(ID,reactor);
       reactors.put(ID,reactor);
       this.ID++;
       return String.format("Created %s Reactor - %d",type,ID-1);
    }

    @Override
    public String moduleCommand(List<String> arguments) {
        int  reactorId =Integer.valueOf(arguments.get(0));
        String type =arguments.get(1);
        int additionalParameter =Integer.valueOf(arguments.get(2));
        String output="";
        switch (type)
        {
            case "CryogenRod":
                EnergyModule module=new CryogenRod(ID,additionalParameter);
                Reactor reactor=reactors.get(reactorId);
                reactor.addEnergyModule(module);
                allParts.put(ID,module);
                output=String.format("Added %s - %d to Reactor - %d",type,ID,reactorId);
                break;
            case "HeatProcessor":
                 AbsorbingModule module1=new HeatProcessor(ID,additionalParameter);
                Reactor reactor1=reactors.get(reactorId);
                reactor1.addAbsorbingModule(module1);
                allParts.put(ID,module1);
                output=String.format("Added %s - %d to Reactor - %d",type,ID,reactorId);
                break;
            case "CooldownSystem":
               AbsorbingModule module2=new CooldownSystem(ID,additionalParameter);
                Reactor reactor2=reactors.get(reactorId);
                reactor2.addAbsorbingModule(module2);
                allParts.put(ID,module2);
                output=String.format("Added %s - %d to Reactor - %d",type,ID,reactorId);
                break;
        }
        ID++;
        return output;
    }

    @Override
    public String reportCommand(List<String> arguments) {
        int id=Integer.valueOf(arguments.get(0));
        Identifiable part=allParts.get(id);
        return part.toString();
    }

    @Override
    public String exitCommand(List<String> arguments) {
        StringBuilder sb=new StringBuilder();
        int cryoReactors=0;
        int heatReactors=0;
        int energyModules=0;
        int absorbingModules=0;
        long totalEnergy=0;
        long totalHeat=0;
        for (Identifiable identifiable:allParts.values())
        {

           switch (identifiable.getClass().getSimpleName())
           {
               case "CryoReactor":
                   cryoReactors++;
                   break;
               case "HeatReactor":
                   heatReactors++;
                   break;
               case "CooldownSystem":
                   absorbingModules++;
                   break;
               case "CryogenRod":
                   energyModules++;
                   break;
               case "HeatProcessor":
                   absorbingModules++;
                   break;
           }
        }
        for (Reactor reactor:reactors.values())
        {
            long tempEnergy=reactor.getTotalEnergyOutput();
            long tempHeat=reactor.getTotalHeatAbsorbing();
            if (tempEnergy<=tempHeat)
            {
                totalEnergy+= reactor.getTotalEnergyOutput();
            }
            totalHeat+=reactor.getTotalHeatAbsorbing();

        }
        sb.append(String.format("Cryo Reactors: %d\n",cryoReactors));
        sb.append(String.format("Heat Reactors: %d\n",heatReactors));
        sb.append(String.format("Energy Modules: %d\n",energyModules));
        sb.append(String.format("Absorbing Modules: %d\n",absorbingModules));
        sb.append(String.format("Total Energy Output: %d\n",totalEnergy));
        sb.append(String.format("Total Heat Absorbing: %d",totalHeat));

          return sb.toString();

    }
}
