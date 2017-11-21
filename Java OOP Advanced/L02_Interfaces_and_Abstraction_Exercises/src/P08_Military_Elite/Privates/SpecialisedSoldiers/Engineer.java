package P08_Military_Elite.Privates.SpecialisedSoldiers;

import P08_Military_Elite.Interfaces.IEngineer;
import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.List;

public class Engineer extends SpecialisedSoldier implements IEngineer {

    private List<Repairs> repairs;

    public Engineer(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs=new ArrayList<>();
    }


    @Override
    public List<Repairs> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %s Salary: %.2f\n",getName(),getLastName(),getId(),getSalary()));
        sb.append("Corps: ").append(getCorps()).append("\n");
        sb.append("Repairs:\n");
        for (Repairs rep:repairs)
        {
            sb.append(rep.toString()).append("\n");
        }
        return sb.toString();
    }
}
