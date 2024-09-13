// 21. E-Commerce Product Catalog
// Scenario: Design a product catalog for an e-commerce platform where customers can browse products.
// Products can be Electronics, Clothing, or Home Appliances.
// Concepts: Classes, Inheritance, ArrayList
// Task: Create a base class Product and derive Electronics, Clothing, and HomeAppliance classes.
// Implement methods to add products to the catalog and display product details.
class Product{
    String name;
    int price;
    Product(String name , int price ){
        this.name = name;
        this.price = price;
    }
    String getName (){
        return this.name;
    }
    int getPrice(){
        return this.price;
    }
}
class Electronics extends Product{
    String Details;
    Electronics(String name , int price , String Details){
        super(name,price);
        this.Details = Details;
    }
    void display(){
        System.out.println("this is the " + name + " it is an electronics product and " + Details);
    }
    String getName() {
        return super.getName();
    }
    int price(){
        return super.getPrice();
    }
}
class Clothing extends Product{
    String Details;
    Clothing(String name , int price , String Details){
        super(name , price);
        this.Details = Details;
    }
    void display(){
        System.out.println("this is the " + name + " it us an clothing product and "+ Details);
    }
    String getName(){
        return super.getName();
    }
    int getPrice(){
        return super.getPrice();
    }
}
class HomeAppliance extends Product{
    String Details;
    HomeAppliance(String name , int price , String Details){
        super(name,price);
        this.Details = Details;
    }
    void display(){
        System.out.println("this is the " + name + " it is an homeappliance product and " + Details);
    }
    String getName(){
        return super.getName();
    }
    int getPrice(){
        return super.getPrice();
    }
}
class ECommerce {
    public static void main(String[] args) {
        HomeAppliance p1 = new HomeAppliance("fridge", 200000 ,"its a fridge");
        Clothing p2 = new Clothing("white shirt ", 1000, "its a shirt");
        Electronics p3 = new Electronics("mobile", 20000, "its a mobile phone ");    
        System.out.println("name " + p1.getName() + " price " + p1.getPrice());
        System.out.println("name " + p2.getName() + "price " + p2.getPrice());
        p1.display();
        p2.display();
    }
}