public class Book {
    // Fields to store title, author, and price of the book
    private String title;
    private String author;
    private double price;

    // Constructor to initialize the book object
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods to access private fields
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Method to apply a discount to the price
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage");
            return;
        }

        double discountAmount = (discountPercentage / 100) * price;
        price = price - discountAmount; // Reduce the price by the discount amount
        System.out.println("Discount applied. New price: $" + price);
    }

    // Main method for testing the Book class
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("Effective Java", "Joshua Bloch", 50.0);

        // Print the book details before applying discount
        System.out.println("Book: " + myBook.getTitle() + " by " + myBook.getAuthor());
        System.out.println("Original price: $" + myBook.getPrice());

        // Apply a discount of 10% and display the new price
        myBook.applyDiscount(10);

        // Check the updated price
        System.out.println("Price after discount: $" + myBook.getPrice());
    }
}
