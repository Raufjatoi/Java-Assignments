import java.time.LocalDate;

public class datetime {


        public static void main(String[] args) {
            // Getting the current date
            LocalDate currentDate = LocalDate.now();

            // Printing just the year
            int year = currentDate.getYear();
            System.out.println("Year: " + year);

            // Printing just the month
            int month = currentDate.getMonthValue();
            System.out.println("Month: " + month);

            // Printing just the day
            int day = currentDate.getDayOfMonth();
            System.out.println("Day: " + day);
        }
    }


