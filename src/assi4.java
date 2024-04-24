/*
Date Parsing Write a program that reads a date string in a specific
format (e.g., "yyyy-MM-dd") from the user and parses it into
a LocalDate object using the LocalDate.parse() method. Handle
 potential parsing exceptions gracefully.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class assi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Enter a date in the format YYYY-MM-DD: ");
        String dateString = scanner.nextLine();

        try {
            LocalDate parsedDate = LocalDate.parse(dateString, formatter);
            System.out.println("Parsed date: " + parsedDate);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter a date in the format YYYY-MM-DD.");
        }
    }



}
