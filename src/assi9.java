import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class assi9{
    public static void main(String[] args){
        System.out.println("\t\t\t HOLIDAY CALINDER ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the holiday date : ");
        String date = in.nextLine();
        System.out.print("Enter the bamw  of holiday : ");
        String bamw = in.nextLine();
        LocalDate localDate = LocalDate.parse(date);

        Map dates = new HashMap();
        dates.put(bamw, localDate);

        System.out.println("\t\t\t HOLIDAY dates  ");
        System.out.println(dates);



    }
}