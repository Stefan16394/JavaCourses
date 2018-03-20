package P02_Command;

public class CommandExecutor implements Executor {

    @Override
    public void executeCommand(Command command) {
       command.execute();
    }
}
