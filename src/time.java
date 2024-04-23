import java.time.*;

public class time {
    public static void main (String[] args) {
        // Create LocalDate
        LocalDate date = LocalDate.now();

        // Create LocalTime
        LocalTime time = LocalTime.now();

        // Create LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();

        // Create ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);

        // Adding days to a date
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        // Subtracting hours from a time
        LocalTime anHourAgo = LocalTime.now().minusHours(1);

        System.out.println(tomorrow);
        System.out.println(anHourAgo);


    };

}
