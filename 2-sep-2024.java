// 27. Weather Forecast Application
// Scenario: Create a weather forecast application where users can view weather updates for different cities.
// Each city has a name, temperature, and weather condition.
// Concepts: Classes, Inheritance, ArrayList
// Task: Design a City class and derive Weather class. Implement methods to add weather updates and display forecasts for selected cities
import java.util.ArrayList;
import java.util.Scanner;
class City {
    String name;
    float temperature;
    String wheather_condition;
    City(String name, float temperature , String wheather_condition){
        this.name = name;
        this.temperature = temperature;
        this.wheather_condition = wheather_condition;
    }
    String getName (){
        return this.name;
    }
    float getTemp(){
        return this.temperature;
    }
    String getcond(){
        return this.wheather_condition;
    }
}
class Weather extends City {
    ArrayList<City> cities;
    Weather(String name, float temperature , String  wheather_condition ){
        super(name,temperature , wheather_condition );
        this.cities = new ArrayList<City>() ;
    }
    Scanner sc = new Scanner(System.in);
    void addWheather(){
        System.out.println("add a new wheather : ");
        System.out.print("Enter name of city : ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.print("temp of the city : ");
        float temperature = sc.nextFloat();
        sc.nextLine();
        System.out.println("what is the wheather condition : ");
        String wheatherCondition = sc.next();
        sc.nextLine();
        cities.add(new Weather(name , temperature , wheatherCondition));
    }
    void updateWheather(City city){
        for (City c : cities ){
            if (city.name == c.name){
                System.out.println("enter new name : ");
                String name = sc.nextLine();
                c.name = name;
                sc.nextLine();
                System.out.println("enter new temp : ");
                float temperature = sc.nextFloat();
                c.temperature = temperature;
                sc.nextLine();
                System.out.println("enter the new condition ");
                String wheatherCondition = sc.nextLine();
                c.wheather_condition = wheatherCondition;
                sc.nextLine();
            }
        }
    }
    void display(City city){
        for (City c : cities){
            if (city.name == c.name){
                System.out.println(" City name " + c.name + " temperature is " + c.temperature + " the condition is " + c.wheather_condition);
            }
        }
    }
}
class wheatherForcastApplication{
    public static void main(String[] args) {
        City c1 = new City("Nawabshah", 30, "it is hot as always ");
        City c2 = new City("karachi", 40,"it is hot too ");
        City c3 = new City("islamabad" ,25 , "its fine here " );

        Weather w1 = new Weather("kashmer",12,"its cold");
        w1.cities.add(c1);
        w1.cities.add(c2);
        w1.cities.add(c3);
        w1.cities.add(w1);

        w1.display(c1);
        w1.display(c2);
        w1.display(c3);
        w1.display(w1);

    }
}