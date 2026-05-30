enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Ex33_EnumDays {
    public static void main(String[] args) {
        // Assign an enum variable
        Day today = Day.FRIDAY;

        System.out.println("Today is set to: " + today);

        // Use a switch statement to print a custom message based on the active Day value
        switch (today) {
            case MONDAY:
                System.out.println("Back to work! Start of the weekday cycle.");
                break;
            case FRIDAY:
                System.out.println("Weekend is almost here! Enjoy your Friday night.");
                break;
            case SUNDAY:
                System.out.println("Rest day. Time to recharge.");
                break;
            default:
                System.out.println("Just another productive mid-week day!");
                break;
        }
    }
}