package P08_Military_Elite.Privates.SpecialisedSoldiers;

import P08_Military_Elite.Interfaces.ICommando;

import java.util.ArrayList;
import java.util.List;

public class Commando extends SpecialisedSoldier implements ICommando {

    private List<Missions> missionsList=new ArrayList<>();

    public Commando(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missionsList=new ArrayList<>();
    }


    @Override
    public List<Missions> getMissions() {
        return this.missionsList;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %s Salary: %.2f\n",getName(),getLastName(),getId(),getSalary()));
        sb.append("Corps: ").append(getCorps()).append("\n");
        sb.append("Missions:\n");
        for (Missions missions:missionsList)
        {
            sb.append("  ").append(missions.toString()).append("\n");
        }
        return sb.toString();
    }
}
