import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the birthdate (yyyy-mm-dd): ");
        String birthdateStr = input.nextLine();

        LocalDate birthdate = LocalDate.parse(birthdateStr);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthdate, today);

        int age = period.getYears();
        System.out.println("The age is: " + age);

        input.close();
    }

}