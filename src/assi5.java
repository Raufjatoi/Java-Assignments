import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class assi5 {

        public static void main(String[] args) {
            System.out.println("\t\t\t Findin the duration program :⏲️ ");
            System.out.println("Enter start time : ");
            LocalDate start = gettime();
            System.out.println("Enter end time : ");
            LocalDate end = gettime();

            Duration duration = Duration.between(start, end);
            System.out.println("Duration : "+duration);
        }
        private static String formatDuration(Duration duration) {
            return duration.toHours() + ":" + duration.toMinutes();
        }
        private static LocalDate gettime() {
            Scanner in = new Scanner(System.in);
            System.out.print("enter year : ");
            int year = in.nextInt();
            System.out.print("enter month : ");
            int month = in.nextInt();
            System.out.print("enter day : ");
            int day = in.nextInt();
            System.out.print("enter hour : ");
            int hour = in.nextInt();
            System.out.print("enter minute : ");
            int minute = in.nextInt();
            System.out.print("enter second : ");
            int second = in.nextInt();
            return LocalDate.of(year, month, day);
        }
    }
