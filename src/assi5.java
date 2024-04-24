/*
Duration between Events:Imagine a scenario where you have events scheduled with start and end dates/times.
Write a program that takes two LocalDateTime objects representing
event start and end times and calculates the duration of the event in hours and minutes.
 */


import java.time.Duration;
import java.time.LocalDateTime;

public class assi5 {
    public static void main(String[] args) {
        // Example events
        LocalDateTime eventStart = LocalDateTime.of(2024, 4, 25, 13, 30);
        LocalDateTime eventEnd = LocalDateTime.of(2024, 4, 25, 15, 45);

        Duration duration = calculateDuration(eventStart, eventEnd);

        System.out.println("Event Duration: " + formatDuration(duration));
    }

    public static Duration calculateDuration(LocalDateTime start, LocalDateTime end) {
        return Duration.between(start, end);
    }

    public static String formatDuration(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        return String.format("%d hours, %d minutes", hours, minutes);
    }
}
