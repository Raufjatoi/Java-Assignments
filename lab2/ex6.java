package lab2;

import java.util.ArrayList;

class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void sell() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("Out of quantity");
        }
    }
    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + quantity);
    }
}

class GroceryStore {
    public ArrayList<Product> inventory;
    public GroceryStore() {
        inventory = new ArrayList<>();
    }
    public void addProduct(Product product) {
        inventory.add(product);
    }
    public void sellProduct(String name) {
        for (Product product : inventory) {
            if (product.getName().equals(name)) {
                product.sell();
                return;
            }
        }
        System.out.println("Product not found");
    }
    public void searchProduct(String name) {
        for (Product product : inventory) {
            if (product.getName().equals(name)) {
                product.display();
                return;
            }
        }
        System.out.println("Product not found");
    }
    public void printInventoryReport() {
        System.out.println("Inventory Report:");
        for (Product product : inventory) {
            product.display();
            System.out.println("huh");
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
