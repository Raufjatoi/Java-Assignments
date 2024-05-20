package lab2;

import java.util.ArrayList;

class Product {
    String name;
    int price;
    int quantity;

    // Constructor
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to reduce quantity by 1
    public void sell() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("Out of stock");
        }
    }

    // Method to display product details
    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantity);
    }
}

class GroceryStore {
    private ArrayList<Product> inventory;

    // Constructor
    public GroceryStore() {
        inventory = new ArrayList<>();
    }

    // Method to add a new product to the inventory
    public void addProduct(Product product) {
        inventory.add(product);
    }

    // Method to sell a product (reduce quantity by 1)
    public void sellProduct(String name) {
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.sell();
                return;
            }
        }
        System.out.println("Product not found");
    }

    // Method to search for a product by name and display its details
    public void searchProduct(String name) {
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.display();
                return;
            }
        }
        System.out.println("Product not found");
    }

    // Method to print a report showing all products and their current stock levels
    public void printInventoryReport() {
        System.out.println("Inventory Report:");
        for (Product product : inventory) {
            product.display();
            System.out.println("--------------");
        }
    }

    public static void main(String[] args) {
        GroceryStore store = new GroceryStore();

        Product milk = new Product("Milk", 199, 10);  // Price in cents for better precision
        Product bread = new Product("Bread", 249, 20);
        Product eggs = new Product("Eggs", 349, 30);

        store.addProduct(milk);
        store.addProduct(bread);
        store.addProduct(eggs);

        store.searchProduct("Milk");
        store.sellProduct("Milk");
        store.searchProduct("Milk");

        store.printInventoryReport();
    }
}
