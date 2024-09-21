// 44. Online Marketplace
// Scenario: Create an online marketplace where sellers can list products for sale.
// Products can be Electronics, Clothing, or Home Appliances.
// Concepts: Classes, Inheritance, ArrayList
// Task: Design a base class Product and derive Electronics, Clothing, and HomeAppliance classes.
// Implement methods to list products and display available products by category.

import java.util.ArrayList;

// Base class for Product
class Product {
    String name;
    double price;

    // Constructor for Product
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Name: " + name + ", Price: $" + price);
    }
}

// Derived class for Electronics
class Electronics extends Product {
    String brand;

    // Constructor for Electronics
    Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    // Override display method to show more details
    void display() {
        System.out.println("Category: Electronics, Name: " + name + ", Brand: " + brand + ", Price: $" + price);
    }
}

// Derived class for Clothing
class Clothing extends Product {
    String size;

    // Constructor for Clothing
    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    // Override display method to show more details
    void display() {
        System.out.println("Category: Clothing, Name: " + name + ", Size: " + size + ", Price: $" + price);
    }
}

// Derived class for HomeAppliance
class HomeAppliance extends Product {
    String model;

    // Constructor for HomeAppliance
    HomeAppliance(String name, double price, String model) {
        super(name, price);
        this.model = model;
    }

    // Override display method to show more details
    void display() {
        System.out.println("Category: Home Appliance, Name: " + name + ", Model: " + model + ", Price: $" + price);
    }
}

// Marketplace class to list and display products
class Marketplace {
    // ArrayList to hold products
    ArrayList<Product> products = new ArrayList<>();

    // Method to add a product
    void addProduct(Product product) {
        products.add(product);
    }

    // Method to display all products by category
    void displayByCategory(String category) {
        System.out.println("Products in category: " + category);
        for (Product product : products) {
            if (category.equals("Electronics") && product instanceof Electronics) {
                product.display();
            } else if (category.equals("Clothing") && product instanceof Clothing) {
                product.display();
            } else if (category.equals("HomeAppliance") && product instanceof HomeAppliance) {
                product.display();
            }
        }
        System.out.println();
    }
}

// Main class to test the functionality
class market {
    public static void main(String[] args) {
        // Create marketplace instance
        Marketplace marketplace = new Marketplace();

        // Add some products
        marketplace.addProduct(new Electronics("Smartphone", 699.99, "Samsung"));
        marketplace.addProduct(new Clothing("T-shirt", 19.99, "M"));
        marketplace.addProduct(new HomeAppliance("Vacuum Cleaner", 129.99, "Dyson V11"));

        // Display products by category
        marketplace.displayByCategory("Electronics");
        marketplace.displayByCategory("Clothing");
        marketplace.displayByCategory("HomeAppliance");
    }
}
