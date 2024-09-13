// 31. Online Bookstore
// Scenario: Design an online bookstore where customers can browse and purchase books. Books can be Fiction, Non-Fiction, or Academic.
// Concepts: Classes, Inheritance, ArrayList
// Task: Create a Book class and derive FictionBook, NonFictionBook, and AcademicBook classes. Implement methods to add books to a cart and calculate the total cost.

import java.util.ArrayList;

class Book{
    String title;
    String author;
    double price;
    Book(String title , String author , double price ){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    double getPrice(){
        return this.price;
    }
    void setPrice(double p ){
        this.price = p;
    }
}
class FictionBook extends Book {
    String genre;
    FictionBook(String title , String author , double price , String genre ){
        super(title , author , price);
        this.genre = genre;
    }
    String getGenre(){
        return this.genre;
    }
}
class NonFictionBook extends Book {
    String subject;
    NonFictionBook(String title , String author , double price , String subject ){
        super(title , author , price);
        this.subject = subject;
    }
    String getSubject(){
        return this.subject;
    }
}
class AcademicBook extends Book{
    String course;
    AcademicBook(String title , String author , double price , String course){
        super(title , author , price );
        this.course = course;
    }
    String getCourse(){
        return this.course;
    }
}
class Cart {
    ArrayList<Book> books;
    Cart(){
        this.books = new ArrayList<>();
    }
    void addbook(Book b) {
        if (!books.contains(b)) {
            books.add(b);
        } else {
            System.out.println(b.getTitle() + " is already in the cart.");
        }
    }
    double calculateTotalCost(){
        double total = 0;
        for (Book b : books ){
            total += b.getPrice();
        }
        return total;
    }
}
class Online_Bookstore{
    public static void main(String[] args) {
        FictionBook b1 = new FictionBook("Harry potter 2", "someone", 2000 ,"magic");
        NonFictionBook b2 = new NonFictionBook("love have 4 words ", "idk", 1000, "love");
        AcademicBook b3 = new AcademicBook("chemistry", "govt", 2000 , "study");

        Cart c1 = new Cart();
        c1.addbook(b3);
        c1.addbook(b1);

        System.out.println("total cost of cart is " + c1.calculateTotalCost());

    }
}