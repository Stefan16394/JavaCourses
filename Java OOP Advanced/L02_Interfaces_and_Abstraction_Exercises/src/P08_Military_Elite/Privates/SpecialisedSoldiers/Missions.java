package P08_Military_Elite.Privates.SpecialisedSoldiers;

public class Missions{
    private String codeName;
    private String state;

    public Missions(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }

    public void CompleteMission(Missions mission)
    {
        this.state="Finished";
    }

    public void setState(String state) {
        if (state.equals("inProgress")|| state.equals("Finished"))
        {
            this.state = state;
        }
        else
        {
            throw new IllegalArgumentException("");
        }
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",codeName,state);
    }
}
