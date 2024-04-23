import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class assi3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateStr = scanner.nextLine();

        // Parse the user input into a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateStr);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the difference between the current date and the birthdate
        Period period = Period.between(birthdate, currentDate);

        // Output the age
        int age = period.getYears();
        System.out.println("Your age is: " + age);

        // Close the scanner
        scanner.close();
    }
}
