package P08_Military_Elite.Spies;

import P08_Military_Elite.Interfaces.ISpy;
import P08_Military_Elite.Privates.Private;
import P08_Military_Elite.Soldier;

public class Spy extends Soldier implements ISpy{
    private Integer codeNumber;

    public Spy(String id, String firstName, String lastName, Integer codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public Integer getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s\n" +
                "Code Number: %d",getName(),getLastName(),getId(),codeNumber);
    }


}
