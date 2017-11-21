package P08_Military_Elite.Privates;

import P08_Military_Elite.Interfaces.ILeutenantGeneral;

import java.util.ArrayList;
import java.util.List;

public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    List<Private> privates;

    public LeutenantGeneral(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates=new ArrayList<>();
    }

    @Override
    public List<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %s Salary: %.2f\n",getName(),getLastName(),getId(),getSalary()));
        sb.append("Privates:\n");
        privates.sort((x,y)->y.getId().compareTo(x.getId()));
        for (Private priv:privates)
        {
            sb.append("  ").append(priv.toString()).append("\n");
        }
        return sb.toString();
    }
}
