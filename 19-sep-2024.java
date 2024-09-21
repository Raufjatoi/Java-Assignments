// 46. Hotel Check-in System
// Scenario: Create a hotel check-in system where guests can check in and out of rooms.
// Rooms have types (Single, Double, Suite) and availability statuses.
// Concepts: Classes, Inheritance, Date
// Task: Design a Room class and a Guest class.
// Implement methods to check guests in and out and update room availability.
class Room{
    String type;
    boolean availability;
    Room(String type , boolean availability){
        this.type = type;
        this.availability = availability;
    }
    String getType(){
        return this.type;
    }
    boolean getAvalability(){
        return this.availability;
    }
    void update(){
        if (this.availability == true){
            this.availability = false;
        }
        else if ( this.availability == false){
            this.availability = true;
        }
    }
}
class Guest {
    String name ;
    Room room;
    boolean is_in; 
    Guest(String name , Room room , boolean is_in ){
        this.name = name ;
        this.room = room;
        this.is_in = is_in;
    }
    void check (Room room , boolean in ){
        if ( in == false){
            room.update();
            System.out.println(room.availability);
        }
    }
}
class n{
    public static void main(String[] args) {
        Room single = new Room("Single ", false);
        Room Double = new Room("Double", false);

        Guest guest = new Guest("Abdul Rauf", single, true);
        System.out.println("guest name : " + guest.name + " room type : " + guest.room.type + "is he in ? : " + guest.is_in);

        guest.check(single, false);

    }
}