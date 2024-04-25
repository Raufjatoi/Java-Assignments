//Periodic Reminder: Simulate a basic reminder system. Read a date and time for a reminder along with a message from the user. Schedule a task (using libraries like java.util.Timer or a
// third-party library) to display the reminder message when the specified date and time arrives.




import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.text.SimpleDateFormat;

public class assi7 {
    // Parse input arguments for reminder date and time, and the message
    public static void main(String[] args) {        if (args.length < 3) {
        System.out.println("Usage: java Reminder <date> <time> <message>");
        return;
    }

    String reminderDateStr = args[0];
    String reminderTimeStr = args[1];
    String reminderMessage = args[2];

    // Format of the date and time strings (adjust according to your input format)
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date reminderDate;

        try {
        // Combine date and time strings into one datetime object
        reminderDate = dateFormat.parse(reminderDateStr + " " + reminderTimeStr);

        // Create a Timer object
        Timer timer = new Timer();

        // Schedule a TimerTask to display the reminder message when the specified time arrives
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Reminder: " + reminderMessage);

                // Stop the timer once the reminder is displayed
                timer.cancel();
            }
        }, reminderDate);

        System.out.println("Reminder scheduled for: " + reminderDateStr + " " + reminderTimeStr);
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
