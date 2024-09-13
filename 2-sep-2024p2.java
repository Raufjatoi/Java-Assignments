// 28. Travel Agency Booking System
// Scenario: Develop a travel agency booking system where customers can book holiday packages.
// Packages can be Domestic or International, each with a destination and price.
// Concepts: Classes, Inheritance, Interface
// Task: Create a base class Package and derive DomesticPackage and InternationalPackage classes.
// Implement an interface Bookable with a method bookPackage.
import java.util.ArrayList;
class Package{
    String destination;
    int price;
    String type;
    Package(String destination, int price){
        this.destination = destination;
        this.price = price;
        this.type = "---";
    }
    void bookPackage(Package p){
        System.out.println("package is booked");
    }
}
class DomesticPackage extends Package{
    String type;
    DomesticPackage(String destination , int price){
        super(destination, price);
        this.type = "Domestic";
    }
}
class InternationalPackage extends Package{
    String type;
    InternationalPackage(String destination , int price){
        super(destination, price);
        this.type = type;
    }
}
class TravelAgencyBookingSystem{
    public static void main(String[] args) {
        DomesticPackage p1 = new DomesticPackage("karachi", 1320);
        DomesticPackage p2 = new DomesticPackage("Hyderabad " , 1200);
        InternationalPackage p3 = new InternationalPackage("bangladesh", 8000);
        ArrayList<Package> packages = new ArrayList<Package>();
        packages.add(p1);
        packages.add(p3);
        packages.add(p2);
        System.out.println("\t Travel Agency Booking System ");
        for (Package p : packages){
            System.out.println("destination " + p.destination + " price " + p.price + " its an " + p.type );
        }
        System.out.println("chouse any of them ");
        p1.bookPackage(p3);
    }
}