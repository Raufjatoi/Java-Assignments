import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalCalender {
    private static Map<LocalDate, String> events = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nPersonal Calendar\n");
            System.out.println("1. Add Event");
            System.out.println("2. Edit Event");
            System.out.println("3. Delete Event");
            System.out.println("4. Show All Events");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addEvent();
                    break;
                case 2:
                    editEvent();
                    break;
                case 3:
                    deleteEvent();
                    break;
                case 4:
                    showAllEvents();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
        System.out.println("Exiting Personal Calendar. Goodbye!");
    }

    private static void addEvent() {
        System.out.print("\nEnter event date (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateStr);
        System.out.print("Enter event description: ");
        String description = scanner.nextLine();
        events.put(date, description);
        System.out.println("Event added successfully!");
    }

    private static void editEvent() {
        System.out.print("\nEnter event date to edit (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateStr);
        if (events.containsKey(date)) {
            System.out.print("Enter new description: ");
            String newDescription = scanner.nextLine();
            events.put(date, newDescription);
            System.out.println("Event edited successfully!");
        } else {
            System.out.println("Event not found for the specified date.");
        }
    }

    private static void deleteEvent() {
        System.out.print("\nEnter event date to delete (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateStr);
        if (events.containsKey(date)) {
            events.remove(date);
            System.out.println("Event deleted successfully!");
        } else {
            System.out.println("Event not found for the specified date.");
        }
    }

    private static void showAllEvents() {
        System.out.println("\nAll Events:");
        if (events.isEmpty()) {
            System.out.println("No events found.");
        } else {
            for (Map.Entry<LocalDate, String> entry : events.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
