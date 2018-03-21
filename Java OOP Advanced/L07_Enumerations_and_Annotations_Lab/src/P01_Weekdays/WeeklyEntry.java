package P01_Weekdays;

import java.util.Comparator;

public class WeeklyEntry {

    public static Comparator<WeeklyEntry> BY_WEEK = (e1,e2)->{
       return Integer.compare(e1.weekday.ordinal(),e2.weekday.ordinal());
    };

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Weekday.valueOf(Weekday.class,weekday.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return this.weekday+" - "+this.notes;
    }
}
