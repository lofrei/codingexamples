package lesson11;

//Source https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html (class/file name chsnged)
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}

public class WeekdaysTest {
    Day day;

    public WeekdaysTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        WeekdaysTest firstDay = new WeekdaysTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        WeekdaysTest thirdDay = new WeekdaysTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        WeekdaysTest fifthDay = new WeekdaysTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        WeekdaysTest sixthDay = new WeekdaysTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        WeekdaysTest seventhDay = new WeekdaysTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
