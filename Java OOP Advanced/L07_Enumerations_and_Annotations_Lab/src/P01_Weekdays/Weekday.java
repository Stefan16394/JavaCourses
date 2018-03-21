package P01_Weekdays;

public enum Weekday {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;


    @Override
    public String toString() {
        String day=this.name().toLowerCase();
        return Character.toUpperCase(this.name().charAt(0))+day.substring(1);
    }
}
