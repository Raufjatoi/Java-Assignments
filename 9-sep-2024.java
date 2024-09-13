// 36. Hotel Booking System
// Scenario: Develop a hotel booking system where customers can book rooms.
// Rooms can be Standard, Deluxe, or Suite, each with a room number and price.
//Concepts: Classes, Inheritance, Date
// Task: Design a Room class and derive StandardRoom, DeluxeRoom, and SuiteRoom classes.
// Implement methods to book rooms and calculate the total cost.

class Room{
    int room_number;
    double price;
    Room(int room_number , double price){
        this.room_number = room_number;
        this.price = price;
    }
    void book(Room r){
        System.out.println("room is booked");
    }
    void cost(Room r){
        System.out.println("total cost" + r.price);
    }
}
class Standard extends Room{
    Standard(int room_number, double price){
        super(room_number, price);
    }
}
class Deluxe extends Room{
    Deluxe(int room_number, double price){
        super(room_number, price);
    }
}
class Suite extends Room{
    Suite(int room_number, double price){
        super(room_number, price);
    }
}
class Hotel_Booking_System{
    public static void main(String[] args) {
            Deluxe deluxe = new Deluxe(2, 2000);
            Standard standard = new Standard(4, 1000);
            Suite suite = new Suite(5, 3000);

            suite.book(suite);
            suite.cost(suite);
            standard.book(standard);
            standard.cost(standard);
            deluxe.book(deluxe);
            deluxe.cost(deluxe);
    }
}