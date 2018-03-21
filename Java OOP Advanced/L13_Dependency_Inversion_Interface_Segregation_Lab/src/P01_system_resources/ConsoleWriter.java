package P01_system_resources;

public class ConsoleWriter implements Writer {
    @Override
    public void println(String message) {
        System.out.println(message);
    }
}
