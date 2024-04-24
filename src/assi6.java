/*
Time Zone Conversion: Write a program that reads a date and time
(e.g., LocalDateTime) along with the source time zone (e.g., "UTC") from the user.
Convert the date and time to a specific target time zone (e.g., "America/Los_Angeles") using the ZonedDateTime class.

 */


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class assi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date and time (format: yyyy-MM-dd HH:mm): ");
        String inputDateTime = scanner.nextLine();

        System.out.println("Enter source time zone (e.g., UTC): ");
        String sourceTimeZoneId = scanner.nextLine();

        System.out.println("Enter target time zone (e.g., America/Los_Angeles): ");
        String targetTimeZoneId = scanner.nextLine();

        convertAndDisplay(inputDateTime, sourceTimeZoneId, targetTimeZoneId);
        scanner.close();
    }

    public static void convertAndDisplay(String inputDateTime, String sourceTimeZoneId, String targetTimeZoneId) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime localDateTime = LocalDateTime.parse(inputDateTime, formatter);
        ZoneId sourceTimeZone = ZoneId.of(sourceTimeZoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, sourceTimeZone);

        ZoneId targetTimeZone = ZoneId.of(targetTimeZoneId);
        ZonedDateTime targetZonedDateTime = zonedDateTime.withZoneSameInstant(targetTimeZone);

        System.out.println("Original Date Time: " + zonedDateTime.format(formatter));
        System.out.println("Converted Date Time: " + targetZonedDateTime.format(formatter));
    }
}
