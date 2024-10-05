class Circle {
    private int radius; // Declare radius as private for better encapsulation

    // Constructor to initialize radius
    public Circle(int radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    // Method to change the radius
    public void changeRadius(int newRadius) {
        this.radius = newRadius;
    }
}

public class prc1 {
    public static void main(String[] args) {
        // Create a circle object with radius 7
        Circle circle = new Circle(7);

        // Calculate the area of the circle
        double area = circle.calculateArea();

        // Print the circle’s area
        System.out.println("The circle area is: " + area);

        // Change the radius to a new value
        circle.changeRadius(10);

        // Recalculate the area after changing the radius
        area = circle.calculateArea();
        System.out.println("The new circle area is: " + area);
    }
}
