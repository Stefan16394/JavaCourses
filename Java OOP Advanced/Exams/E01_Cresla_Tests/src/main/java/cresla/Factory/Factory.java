package cresla.Factory;

import cresla.interfaces.Manager;
import cresla.interfaces.Reactor;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Factory implements Manager {
    private int ID=1;

    private Map<Integer,Reactor> reactors;

    public Factory() {
        this.reactors=new LinkedHashMap<>();
    }


    @Override
    public String reactorCommand(List<String> arguments) {
//        Reactor reactor=null;
//        switch (arguments.get(0))
//        {
//            case "Cryo":
//                reactor=new CryoReactor(ID,Integer.valueOf(arguments.get(2)),Integer.valueOf(arguments.get(1)));
//                break;
//            case "Heat":
//                reactor = new HeatReactor(ID,Integer.valueOf(arguments.get(2)),Integer.valueOf(arguments.get(1)));
//                break;
//        }
//        reactors.put(ID,reactor);
//        this.ID++;
// return "Ds";
        return null;
    }

    @Override
    public String moduleCommand(List<String> arguments) {
        return null;
    }

    @Override
    public String reportCommand(List<String> arguments) {
        return null;
    }

    @Override
    public String exitCommand(List<String> arguments) {
        return null;
    }
}
