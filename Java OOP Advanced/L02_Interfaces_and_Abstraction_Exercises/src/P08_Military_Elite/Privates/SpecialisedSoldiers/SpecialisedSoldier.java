package P08_Military_Elite.Privates.SpecialisedSoldiers;

import P08_Military_Elite.Interfaces.ISpecialisedSoldier;
import P08_Military_Elite.Privates.Private;

public class SpecialisedSoldier extends Private implements ISpecialisedSoldier {
    private String corps;

    public SpecialisedSoldier(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        setCorps(corps);
    }

    public void setCorps(String corps) {
        if(corps.equals("Airforces")|| corps.equals("Marines"))
        {
            this.corps = corps;
        }
        else
        {
            throw new IllegalArgumentException("");
        }
    }

    @Override
    public String getCorps() {
        return this.corps;
    }
}
