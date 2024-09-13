// 30. Vehicle Service Management
// Scenario: Develop a vehicle service management system where customers can book services for their vehicles.
// Services can be for Cars, Bikes, or Trucks.
// Concepts: Classes, Inheritance, Interface
// Task: Create a base class Service and derive CarService, BikeService, and TruckService classes.
// Implement an interface Serviceable with a method bookService.
/*
    Interface: Serviceable
          |
          | implements
          v
     +-----------------------+
     |       Service         | 
     |-----------------------|
     | - serviceId: int      |
     | - serviceName: String |
     | - serviceCost: double |
     | + getServiceDetails() |
     +-----------------------+
           ^
           |
           | extends
   +-------+---------+---------+
   |       |         |         |
   v       v         v         v
+-----------+   +-----------+   +-------------+
| CarService |   | BikeService |   | TruckService |
|------------|   |-------------|   |--------------|
| - carModel: String  |  | - bikeModel: String  |  | - truckModel: String  |
| - carType: String   |  | - bikeType: String   |  | - truckType: String   |
| + bookService()     |  | + bookService()      |  | + bookService()       |
+---------------------+  +---------------------+  +-----------------------+
*/
class Service{
    int id;
    String name;
    double cost;
    Service(int id , String name , double cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    void getServiceDetails(){
        System.out.println( "Name : "+ this.name);
        System.out.println("Cost : "+ this.cost);
        System.out.println("id :"+this.id );
    }
}
class CarService extends Service{
    String carModel;
    String carType;
    CarService(int id , String name , double cost, String carModel , String carType){
        super(id, name, cost);
        this.carModel = carModel;
        this.carType = carType;
    }
    void bookService(){
        System.out.println(" Car Service booked");
    }
}
class BikeService extends Service{
    String bikeModel;
    String bikeType;
    BikeService(int id , String name , double cost, String bikeModel , String bikeType){
        super(id, name, cost);
        this.bikeModel = bikeModel;
        this.bikeType = bikeType;
    }
    void bookService(){
        System.out.println(" Bike Service booked");
    }
}
class TruckService extends Service{
    String truckModel;
    String truckType;
    TruckService(int id , String name , double cost, String truckModel , String truckType){
        super(id, name, cost);
        this.truckModel = truckModel;
        this.truckType = truckType;
    }
    void bookService(){
        System.out.println(" Bike Service booked");
    }
}

class Vehicle_Service_Management{
    public static void main(String[] args) {
        Service s1 = new Service(1, "car", 3000);
        Service s2 = new Service(2, "bike", 1000);
        Service s3 = new Service(3,"Truck", 4500);
        s1.getServiceDetails();
        s2.getServiceDetails();
        s3.getServiceDetails();

        CarService c1 = new CarService(1, "car", 3000, "alto", "4 wheel");
        BikeService b1 = new BikeService(2, "bike", 1000, "125", "honda");
        TruckService t1 = new TruckService(3, "truck", 4500, "h2", "tesla");
        c1.bookService();
        b1.bookService();
        t1.bookService();

    }
}