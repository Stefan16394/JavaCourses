package P01_Weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeeklyCalendar {
    private List<WeeklyEntry> weeklyEntries;

    public WeeklyCalendar() {
        this.weeklyEntries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes)
    {
        this.weeklyEntries.add(new WeeklyEntry(weekday,notes));
    }

   public Iterable<WeeklyEntry> getWeeklySchedule()
   {
       Collections.sort(this.weeklyEntries,WeeklyEntry.BY_WEEK);
       return weeklyEntries;
   }
}
