package P01_Logger;

public interface Handler {
    void handle(LogType logType,String message);
    void setSuccessor(Handler handler);
}
