package lab2;
import java.util.Scanner;
class Item {
    String name;
    int price;
    int quantity;
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    Item[] cart;
    int itemCount;
    public ShoppingCart(int capacity) {
        cart = new Item[capacity];
        itemCount = 0;
    }
    public void addItem(Item item) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].name.equals(item.name)) {
                cart[i].quantity += item.quantity;
                return;
            }
        }
        if (itemCount < cart.length) {
            cart[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Cart is full!");
        }
    }
    public void updateItemQuantity(String productName, int quantity) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].name.equals(productName)) {
                cart[i].quantity = quantity;
                return;
            }
        }
        System.out.println("Item not found in cart!");
    }
    public void removeItem(String productName) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].name.equals(productName)) {
                
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

    
    public double calculateTotalBill() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += cart[i].price * cart[i].quantity;
        }
        return total;
    }

    
    public void printCart() {
        System.out.println("Cart Contents:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cart[i].name + " - Quantity: " + cart[i].quantity + " - Price: $" + cart[i].price);
        }
    }
}


public class ex7{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        ShoppingCart cart = new ShoppingCart(10);

        while (true) {
            
            System.out.println("1. Add item to cart");
            System.out.println("2. Update item quantity");
            System.out.println("3. Remove item from cart");
            System.out.println("4. Calculate total bill");
            System.out.println("5. Print cart contents");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    int price = scanner.nextInt();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(new Item(name, price, quantity));
                    break;
                case 2:
                    
                    System.out.print("Enter product name: ");
                    name = scanner.next();
                    System.out.print("Enter new quantity: ");
                    quantity = scanner.nextInt();
                    cart.updateItemQuantity(name, quantity);
                    break;
                case 3:
                    
                    System.out.print("Enter product name: ");
                    name = scanner.next();
                    cart.removeItem(name);
                    break;
                case 4:
                    
                    System.out.println("Total Bill: $" + cart.calculateTotalBill());
                    break;
                case 5:
                    
                    cart.printCart();
                    break;
                case 6:
                    
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

