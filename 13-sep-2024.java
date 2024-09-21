// 41. Sports Event Management
// Scenario: Develop a sports event management system where organizers can schedule events.
// Events can be Football, Basketball, or Cricket matches.
// Concepts: Classes, Inheritance, Date
// Task: Create a base class Event and derive FootballMatch, BasketballMatch, and CricketMatch classes.
// Implement methods to schedule events and display event details.

import java.text.SimpleDateFormat;
import java.util.Date;

class Event {
    String name;
    Date date;
    String location;
    Event(String name, String date, String location) throws Exception {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.date = dateFormat.parse(date);
        this.location = location;
    }
    void scheduleEvent() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Event '" + name + "' scheduled on " + dateFormat.format(date) + " at " + location);
    }
    void displayDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Event Details:");
        System.out.println("Name: " + name);
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("Location: " + location);
    }
}
class FootballMatch extends Event {
    String teams;
    FootballMatch(String name, String date, String location, String teams) throws Exception {
        super(name, date, location);
        this.teams = teams;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Teams: " + teams);
    }
}
class BasketballMatch extends Event {
    String teams;
    BasketballMatch(String name, String date, String location, String teams) throws Exception {
        super(name, date, location);
        this.teams = teams;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Teams: " + teams);
    }
}
class CricketMatch extends Event {
    String teams;
    CricketMatch(String name, String date, String location, String teams) throws Exception {
        super(name, date, location);
        this.teams = teams;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Teams: " + teams);
    }
}

class SportsEventManagement {
    public static void main(String[] args) {
        try {
            FootballMatch footballMatch = new FootballMatch("Championship Final", "2024-09-20", "Stadium A", "Team A vs Team B");
            footballMatch.scheduleEvent();
            footballMatch.displayDetails();

            BasketballMatch basketballMatch = new BasketballMatch("League Match", "2024-10-15", "Arena B", "Team X vs Team Y");
            basketballMatch.scheduleEvent();
            basketballMatch.displayDetails();

            CricketMatch cricketMatch = new CricketMatch("World Cup Final", "2024-11-05", "Ground C", "Team 1 vs Team 2");
            cricketMatch.scheduleEvent();
            cricketMatch.displayDetails();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
