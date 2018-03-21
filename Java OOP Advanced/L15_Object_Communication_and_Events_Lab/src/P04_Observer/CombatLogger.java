package P04_Observer;

public class CombatLogger implements Handler {
    private Handler successor;

    @Override
    public void handle(LogType logType, String message) {
       if (logType== LogType.ATTACK || logType== LogType.TARGET)
       {
           System.out.println(logType.name()+": "+message);
       }
       else
           if (this.successor!=null) {
               successor.handle(logType, message);
           }
    }

    @Override
    public void setSuccessor(Handler handler) {
        this.successor=handler;
    }
}
