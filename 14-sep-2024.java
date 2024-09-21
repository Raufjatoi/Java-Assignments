// 42. Online Auction System
// Scenario: Create an online auction system where users can bid on items.
// Items can be Electronics, Antiques, or Artworks, each with a starting price and auction end date.
// Concepts: Classes, Inheritance, Date, ArrayList
// Task: Design a base class Item and derive ElectronicItem, AntiqueItem, and ArtworkItem classes.
// Implement methods to place bids and determine the highest bidder.
import java.util.ArrayList;
import java.util.Date;
class Item {
    String name;
    double startingPrice;
    Date endDate;
    ArrayList<Bid> bids;
    Item(String name, double startingPrice, Date endDate) {
        this.name = name;
        this.startingPrice = startingPrice;
        this.endDate = endDate;
        this.bids = new ArrayList<>();
    }
    void placeBid(String bidderName, double amount) {
        if (new Date().before(endDate)) {
            if (amount > startingPrice) {
                bids.add(new Bid(bidderName, amount));
                System.out.println("Bid placed successfully by " + bidderName + " for $" + amount);
            } else {
                System.out.println("Bid must be higher than the starting price!");
            }
        } else {
            System.out.println("The auction has ended. No more bids can be placed.");
        }
    }
    Bid getHighestBid() {
        if (bids.isEmpty()) {
            System.out.println("No bids placed on this item.");
            return null;
        }   
        Bid highestBid = bids.get(0);
        for (Bid bid : bids) {
            if (bid.amount > highestBid.amount) {
                highestBid = bid;
            }
        }
        return highestBid;
    }
    void displayWinner() {
        Bid highestBid = getHighestBid();
        if (highestBid != null) {
            System.out.println("The highest bidder for " + name + " is " + highestBid.bidderName +
                               " with a bid of $" + highestBid.amount);
        }
    }
}
class ElectronicItem extends Item {
    public ElectronicItem(String name, double startingPrice, Date endDate) {
        super(name, startingPrice, endDate);
    }
}
class AntiqueItem extends Item {
    AntiqueItem(String name, double startingPrice, Date endDate) {
        super(name, startingPrice, endDate);
    }
}
class ArtworkItem extends Item {
    ArtworkItem(String name, double startingPrice, Date endDate) {
        super(name, startingPrice, endDate);
    }
}
class Bid {
    String bidderName;
    double amount;

    Bid(String bidderName, double amount) {
        this.bidderName = bidderName;
        this.amount = amount;
    }
}
class AuctionSystem {
    static void main(String[] args) {
        Date endDate = new Date(System.currentTimeMillis() + 60 * 1000);  // Auction ends in 1 minute
        ElectronicItem laptop = new ElectronicItem("Laptop", 300.00, endDate);
        AntiqueItem vase = new AntiqueItem("Antique Vase", 100.00, endDate);
        ArtworkItem painting = new ArtworkItem("Abstract Painting", 500.00, endDate);
        laptop.placeBid("Alice", 350.00);
        laptop.placeBid("Bob", 400.00);
        vase.placeBid("Charlie", 150.00);
        vase.placeBid("Alice", 130.00); 
        painting.placeBid("Diana", 600.00);
        System.out.println("\nAuction Results:");
        laptop.displayWinner();
        vase.displayWinner();
        painting.displayWinner();
    }
}



