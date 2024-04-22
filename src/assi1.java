import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class assi1 {
    /*Date Difference: Write a program that takes two dates as
     input from the user (e.g., using Scanner) and calculates the difference between them in days.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first date
        System.out.println("Enter the first date:");
        LocalDate date1 = getDateFromUser(scanner);

        // Get the second date
        System.out.println("Enter the second date:");
        LocalDate date2 = getDateFromUser(scanner);

        // Calculate the difference
        Period difference = Period.between(date1, date2);

        // Print the result
        System.out.println("Difference in days: " + difference.getDays());
    }

    private static LocalDate getDateFromUser(Scanner scanner) {
        int year, month, day;

        do {
            System.out.print("Enter year: ");
            year = scanner.nextInt();
            System.out.print("Enter month (1-12): ");
            month = scanner.nextInt();
            System.out.print("Enter day: ");
            day = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

        } while (!isValidDate(year, month, day));

        return LocalDate.of(year, month, day);
    }

    private static boolean isValidDate(int year, int month, int day) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            System.out.println("Invalid date. Please try again.");
            return false;
        }
    }

}
