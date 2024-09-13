// 39. Bus Ticket Reservation System
// Scenario: Create a bus ticket reservation system where passengers can book tickets for different routes.
// Each bus has a route number, capacity, and ticket price.
// Concepts: Classes, Inheritance, Date
// Task: Design a Bus class and a Ticket class.
// Implement methods to book tickets and display available routes.

import java.util.ArrayList;

class Bus {
    String route_number;
    int capacity;
    double ticket_price;

    // Constructor to initialize Bus object
    Bus(String route_number, int capacity, double ticket_price) {
        this.route_number = route_number;
        this.capacity = capacity;
        this.ticket_price = ticket_price;
    }

    // Method to display available routes
    void display(ArrayList<Bus> routes) {
        System.out.println("Available routes:");
        for (Bus r : routes) {
            System.out.println("Route: " + r.route_number + ", Capacity: " + r.capacity + ", Ticket Price: $" + r.ticket_price);
        }
    }
}

class Ticket extends Bus {
    String passengerName;

    // Constructor to initialize Ticket object
    Ticket(String route_number, int capacity, double ticket_price, String passengerName) {
        super(route_number, capacity, ticket_price);
        this.passengerName = passengerName;
    }

    // Method to book a ticket
    void book() {
        if (capacity > 0) {
            capacity--;
            System.out.println("Ticket booked for " + passengerName + " on route " + route_number + ". Remaining capacity: " + capacity);
        } else {
            System.out.println("Sorry, no available seats on route " + route_number);
        }
    }
}


class Ticket_Reservation_System {
    public static void main(String[] args) {
        // Creating a list of available routes
        ArrayList<Bus> routes = new ArrayList<>();
        routes.add(new Bus("101", 50, 15.5));
        routes.add(new Bus("102", 40, 10.0));
        routes.add(new Bus("103", 30, 12.0));

        // Displaying available routes
        Bus busSystem = new Bus("", 0, 0.0);
        busSystem.display(routes);

        // Booking tickets
        Ticket ticket1 = new Ticket("101", 50, 15.5, "John Doe");
        Ticket ticket2 = new Ticket("102", 40, 10.0, "Jane Smith");

        ticket1.book();
        ticket2.book();
    }
}
