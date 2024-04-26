import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class assi3{
    public static void main(String[] args){
        System.out.println("\t\t\t Age calculator 📅");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age in yyyy-mm-dd: ");
        LocalDate age = LocalDate.parse(in.nextLine());
        LocalDate present = LocalDate.now();

        Period diff = Period.between(age, present);

        int years = diff.getYears();

        System.out.println("\t\t\t Age is " + years);

    }

}