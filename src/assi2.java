import java.util.Scanner;
public class assi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in 24-hour format (HH:MM): ");
        String time24 = scanner.nextLine();

        String time12 = convertTime(time24);
        System.out.println("Converted time (12-hour format): " + time12);
    }

    private static String convertTime(String time24) {
        try {
            int hour = Integer.parseInt(time24.split(":")[0]);
            int minute = Integer.parseInt(time24.split(":")[1]);

            if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
                return "Invalid time format.";
            }

            String period = hour < 12 ? "AM" : "PM";
            hour = hour % 12;
            hour = hour == 0 ? 12 : hour;

            return String.format("%02d:%02d %s", hour, minute, period);
        } catch (Exception e) {
            return "Invalid time format.";
        }
    }
}
