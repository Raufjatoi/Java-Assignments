import java.time.LocalTime;
import java.util.Scanner;

public class assi2 {
    public static void main(String[] args){
        System.out.println("converting the time of systems program 🕧");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the time in 24 hrs format : ");
        String time = in.nextLine();
        LocalTime localTime = LocalTime.parse(time);
        System.out.print("Converting the time in 12 hrs format : ");
        LocalTime convertedTime = localTime.plusHours(12);
        System.out.println(convertedTime);


    }

}