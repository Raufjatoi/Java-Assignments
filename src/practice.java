import java.time.LocalDate;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date : ");
        String date = sc.nextLine();
        int day = LocalDate.now().getDayOfMonth();
        System.out.print("Today is " + day);
    }
}