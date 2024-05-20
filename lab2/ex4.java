package lab2;
class Shape {
    String color = "black";
}
class  circle extends Shape {
    double radius = 12.12 ;

    public static void calculate_area (double radius){
        System.out.println((3.14*radius*radius));

    }
}
public class ex4 {
    public static void main(String[] args) {
        circle.calculate_area(12.12);
        
    }
    
}
