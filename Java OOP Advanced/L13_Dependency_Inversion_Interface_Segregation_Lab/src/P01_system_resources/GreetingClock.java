package P01_system_resources;

import java.time.LocalTime;

public class GreetingClock {

    private TimeProvider time;
    private Writer writer;

    public GreetingClock(TimeProvider timeProvider,Writer writer) {
        this.time=timeProvider;
        this.writer=writer;
    }

    public void greeting() {
        if (this.time.getHour() < 12) {
            writer.println("Good morning...");
        } else if (this.time.getHour() < 18) {
            writer.println("Good afternoon...");
        } else {
            writer.println("Good evening...");
        }
    }
}
