package P01_Event_Implementation;

public class Handler implements NameChangeListener {
    @Override
    public void handleChangedName(NameChange event) {
        System.out.println(String.format("Dispatcher's name changed to %s.",event.getChangedName()));
    }
}
