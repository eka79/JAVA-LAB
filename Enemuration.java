package lab01_08;

public class Enemuration {

    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWorkday() {
            return this != SATURDAY && this != SUNDAY;
        }
    }

    public static void main(String[] args) {
        // Check if Monday is a workday
        System.out.println("Is Monday a workday? " + Days.MONDAY.isWorkday());

        // Check if Saturday is a workday
        System.out.println("Is Saturday a workday? " + Days.SATURDAY.isWorkday());
    }
}
