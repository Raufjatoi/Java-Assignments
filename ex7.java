import java.util.Scanner;

// Class representing an item in the shopping cart
class Item {
    // Member variables for the product name, price, and quantity
    String name;
    int price;
    int quantity;

    // Constructor to initialize an Item object
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

// Class representing the shopping cart
class ShoppingCart {
    // Array to hold Item objects representing the cart's contents
    Item[] cart;
    // Variable to keep track of the number of items in the cart
    int itemCount;

    // Constructor to initialize the ShoppingCart with a specified capacity
    public ShoppingCart(int capacity) {
        cart = new Item[capacity];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(Item item) {
        // Check if the item already exists in the cart
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].name.equals(item.name)) {
                // If it exists, update the quantity
                cart[i].quantity += item.quantity;
                return;
            }
        }
        // If the item does not exist, add it to the cart
        if (itemCount < cart.length) {
            cart[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Cart is full!");
        }
    }

    // Method to update the quantity of an existing item in the cart
    public void updateItemQuantity(String productName, int quantity) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].name.equals(productName)) {
                cart[i].quantity = quantity;
                return;
            }
        }
        System.out.println("Item not found in cart!");
    }

    // Method to remove an item from the cart
    public void removeItem(String productName) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].name.equals(productName)) {
                // Shift remaining items to the left to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null;
                itemCount--;
                return;
            }
        }
        System.out.println("Item not found in cart!");
    }

    // Method to calculate the total bill amount
    public double calculateTotalBill() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += cart[i].price * cart[i].quantity;
        }
        return total;
    }

    // Method to print the contents of the cart
    public void printCart() {
        System.out.println("Cart Contents:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cart[i].name + " - Quantity: " + cart[i].quantity + " - Price: $" + cart[i].price);
        }
    }
}

// Main class to test the ShoppingCart functionality
public class ex7{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a shopping cart with a capacity of 10 items
        ShoppingCart cart = new ShoppingCart(10);

        while (true) {
            // Display menu options
            System.out.println("1. Add item to cart");
            System.out.println("2. Update item quantity");
            System.out.println("3. Remove item from cart");
            System.out.println("4. Calculate total bill");
            System.out.println("5. Print cart contents");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            // Read the user's choice
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add item to cart
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    int price = scanner.nextInt();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(new Item(name, price, quantity));
                    break;
                case 2:
                    // Update item quantity
                    System.out.print("Enter product name: ");
                    name = scanner.next();
                    System.out.print("Enter new quantity: ");
                    quantity = scanner.nextInt();
                    cart.updateItemQuantity(name, quantity);
                    break;
                case 3:
                    // Remove item from cart
                    System.out.print("Enter product name: ");
                    name = scanner.next();
                    cart.removeItem(name);
                    break;
                case 4:
                    // Calculate total bill
                    System.out.println("Total Bill: $" + cart.calculateTotalBill());
                    break;
                case 5:
                    // Print cart contents
                    cart.printCart();
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
