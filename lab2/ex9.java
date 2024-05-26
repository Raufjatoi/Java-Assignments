package lab2;

import lab.diagram;

//4. Restaurant Menu:
// Create a class named Dish with member variables for name, description (optional), and
//price.
// Create another class named RestaurantMenu that has an array of Dish objects.
// Implement methods in RestaurantMenu to:
//o Add a new dish to the menu.
//o Display all dishes with their names and prices.
//o Search for a dish by name and display its details (if found).
//o Categorize dishes based on a type (e.g., appetizer, main course) and display them
//separately (assuming a category member variable in Dish).

class Dish{
    String name ;
    int price;

    // constructoe ?
    public Dish( String name , int price ){
        this.name = name;
        this.price = price;
    }

}


class RestaurantMenu{
    static Dish [] dishes = new Dish[100];
    static int counts = 0;

    public static void add(Dish dish){
        dishes[counts] = dish;
        counts ++;
    }

    public static void display(){
        System.out.println( "name of dish is " + dishes[0].name + " and price is " + dishes[0].price );

    }

    public static Dish search(Dish dish){
        return dish;
    }

    public static void cat(){
        System.out.println("testing");
    }
} 


public class ex9 {
    public static void main(String[] args) {
        Dish d1 = new Dish("pizza",200);

        RestaurantMenu.add(d1);
        RestaurantMenu.display();
        
    }
    
}
