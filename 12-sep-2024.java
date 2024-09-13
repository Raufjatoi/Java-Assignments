// 40. Online Grocery Store
// Scenario: Design an online grocery store where customers can order groceries.
// Products can be Vegetables, Fruits, or Dairy, each with a name and price.
// Concepts: Classes, Inheritance, ArrayList
// Task: Create a base class Product and derive Vegetable, Fruit, and DairyProduct classes.
//  Implement methods to add products to a cart and calculate the total bill.

import java.util.ArrayList;

class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    void add(Product p, ArrayList<Product> cart) {
        cart.add(p);
        System.out.println("added product in the cart");
    }
    
    void total(ArrayList<Product> cart) {
        double total = 0;
        for (Product p : cart) {
            total += p.price;
        }
        System.out.println("total price is: " + total);
    }
}

class Vegetable extends Product {
    Vegetable(String name, double price) {
        super(name, price);
    }
}

class Fruit extends Product {
    Fruit(String name, double price) {
        super(name, price);
    }
}

class DairyProduct extends Product {
    DairyProduct(String name, double price) {
        super(name, price);
    }
}

class 12-sep-2024 {
    public static void main(String[] args) {
        Vegetable potato = new Vegetable("potato", 100);
        Fruit apple = new Fruit("apple", 200);
        DairyProduct milk = new DairyProduct("milk", 120);

        ArrayList<Product> cart = new ArrayList<>();

        Product p = new Product("nothin", 0);

        p.add(apple, cart);
        p.add(milk, cart);

        p.total(cart);
    }
}
