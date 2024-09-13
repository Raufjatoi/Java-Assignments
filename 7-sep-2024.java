// 34. Restaurant Reservation System
// Scenario: Develop a restaurant reservation system where customers can reserve tables.
// Tables have numbers, sizes, and availability statuses.
// Concepts: Classes, Inheritance, Date
// Task: Create a Table class and a Reservation class.
// Implement methods to make reservations and display available tables.

import java.util.Date;
class Table{
    int tableNumber;
    int size;
    boolean isAvailable;
    Table(int tableNumber , int size){
        this.tableNumber = tableNumber;
        this.size = size;
        this.isAvailable = true;
    }
    void setAvailability(boolean status){
        this.isAvailable = status;
    }
    void getDetails(){
        System.out.println("Table Number : "+ this.tableNumber);
        System.out.println("Size :"+ this.size );
        System.out.println("Status : "+ this.isAvailable);
    }
}
class Reservation{
    String customerName;
    Date reservationDate;
    Table table;
    Reservation(String customerName , Date reservationDate , Table table ){
        this.customerName = customerName;
        this.reservationDate = reservationDate;
        this.table = table;
    }
    void makeReservation(Table table){
        System.out.println("Table number " + table.tableNumber + " is booked");
        this.table = table;
    }
    void displayReservation(){
        System.out.println("Table number : " + this.table.tableNumber);
        System.out.println("Reserved by : "+ this.customerName);
        System.out.println("Dated : " + this.reservationDate);
    }
}
class restaurant{
    public static void main(String[] args) {
        Table t1 = new Table(1, 5);
        Date date = new Date(124, 8, 12);
        Reservation r1 = new Reservation("Rauf", date, t1);
        t1.getDetails();
        r1.displayReservation();

    }
}