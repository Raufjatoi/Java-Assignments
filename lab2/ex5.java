package lab2;
class Rectangle {
    int height , width ;

    public void area(int height , int width){
        System.out.println(this.height * this.width);
    }
    }


public class ex5 {
    public static void main(String[] args) {
        
    Rectangle obj1 = new Rectangle();
    obj1.height = 12;
    obj1.width = 15;
    obj1.area(obj1.height, obj1.width);
 
    Rectangle obj2 = new Rectangle();
    obj2.height = 14;
    obj2.width = 20;

    obj2.area(obj2.height,obj2.width);
    
}
}