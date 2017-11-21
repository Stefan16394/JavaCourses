package P08_Military_Elite.Privates.SpecialisedSoldiers;

public class Repairs{
    private String partName;
    private int hoursWorked;

    public Repairs(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("  Part Name: %s Hours Worked: %d",partName,hoursWorked);
    }
}