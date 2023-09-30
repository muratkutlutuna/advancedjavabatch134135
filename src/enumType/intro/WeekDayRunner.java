package enumType.intro;

public class WeekDayRunner {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.THURSDAY;
        System.out.println(day);
        if (day == DaysOfWeek.FRIDAY) {
            System.out.println("Yaay, tomottow is holiday...");
        }
        for (DaysOfWeek d : DaysOfWeek.values()) {
            System.out.print(d+" ");
        }
    }
}
