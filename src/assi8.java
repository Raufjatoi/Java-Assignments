import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class assi8{
    public static void main(String[] args){
        System.out.println("\t\t\t DATE AND TIME VALIDATOR : ");
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter date in the format YYYY-MM-DD-hh-mm-ss and date should now ");
        String date = in.nextLine();

        LocalDateTime dateTime = LocalDateTime.parse(date);

        if (dateTime.isBefore(LocalDateTime.now())){
            System.out.println("Correct ");

        } else {
            System.out.println("Invalid date");
        }
    }
}