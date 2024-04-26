import java.time.LocalDateTime;
import java.time.ZonedDateTime ;
import java.util.Scanner;

public class assi6{
    public static void main(String[] args){
        System.out.println("Time Zone converter : ");
        Scanner in = new Scanner (System.in);
        System.out.print("Enter date and time  like yyyy-MM-dd'T'HH:mm:ss'Z' : ");
        String datetime = in.nextLine();
        LocalDateTime localTime = LocalDateTime.parse(datetime);
        System.out.print("Enter the time zone ");
        String timezone = in.nextLine();

        ZonedDateTime convertedtime = ZonedDateTime.from(localTime);
        System.out.print(convertedtime);

    }

}