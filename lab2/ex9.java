package lab2;

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

    public static void add(Dish d1 , Dish d2 , Dish d3 , Dish d4 ){
        dishes[0] = d1;
        dishes[1] = d2;
        dishes[2] = d3;
    }

    public static void display(){
        
        System.out.println(dishes[0].name + " price : " + dishes[0].price);
        System.out.println(dishes[1].name + " price : " + dishes[1].price);
        System.out.println(dishes[2].name + " price : " + dishes[2].price);
            }

    public static void search(Dish dish){
        if (dish.name == dishes[0].name || dish.name == dishes[1].name || dish.name == dishes[2].name ){
            System.out.println(dish.name + " is found ");

        }
            
            else{
                System.out.println("didnt found anythin based on tha ");
            }
        }
    

    public static void cat(){
        System.out.println("category is underprocess");
    }
    
} 


public class ex9 {
    public static void main(String[] args) {
        Dish d1 = new Dish("pizza",200);
        Dish d2 = new Dish("burger",300);
        Dish d3 = new Dish("finger chips",150);
        Dish d4 = new Dish("pizza" , 220);

        RestaurantMenu.add(d1, d2 , d3 , d4 );
        RestaurantMenu.display();

        RestaurantMenu.search(d1);
        RestaurantMenu.search(d2);

        RestaurantMenu.cat();
        
    }
    
}
