package P01_Weekdays;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar w=new WeeklyCalendar();
        w.addEntry("Tuesday","sleep");
        w.addEntry("Friday","note");
        w.addEntry("Thursday","die");
        Iterable<WeeklyEntry> schedule=w.getWeeklySchedule();
        for (WeeklyEntry weeklyEntry:schedule)
        {
            System.out.println(weeklyEntry);
        }
    }
}
