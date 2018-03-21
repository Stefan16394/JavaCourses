package P01_Event_Implementation;

public class NameChange extends EventObject {
    private String changedName;

    public NameChange(String changedName) {
        this.changedName = changedName;
    }

    @Override
    protected String getChangedName() {
        return this.changedName;
    }
}
