// 35. Flight Management System
// Scenario: Design a flight management system where airlines can manage their flights.
// Flights have flight numbers, destinations, and departure dates.
// Concepts: Classes, Inheritance, Date
// Task: Create a Flight class and an Airline class.
// Implement methods to add flights and display flight details.

import java.util.Date;
import java.util.ArrayList;

class Airline{
    String name;
    ArrayList<Flight> flights;
    Airline(String name){
        this.name = name;
        this.flights = new ArrayList<>();
    }
    void addFlight(Flight flight){
        flights.add(flight);
    }
    void displayFlights(){
        for (Flight f : flights){
            f.getDetails(f);
        }
    }
}
class Flight{
    String flightNumber;
    String destination;
    Date departureDate;
    Flight(String flightNumber , String destination , Date departureDate){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureDate = departureDate;
    }
    void getDetails(Flight f ){
        System.out.println("Number : "+ f.flightNumber);
        System.out.println("Destination : "+ f.destination);
        System.out.println("Departure Date : "+ f.departureDate);
    }   
}
class Flight_Management_System{
    public static void main(String[] args) {
            Date d1 = new Date(124, 9, 10);
            Date d2 = new Date(124, 9, 13);
            Date d3 = new Date(124, 10, 14);
            Date d4 = new Date(124, 11, 23);

            Flight nawabshah = new Flight("02f", "Nawabshah", d1);
            Flight karachi = new Flight("07g", "Karachi", d2);
            

            Airline pia = new Airline("PIA");

            pia.addFlight(nawabshah);
            pia.addFlight(karachi);

            System.out.println(pia.name);

            pia.displayFlights();

    }
}