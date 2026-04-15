import java.util.Scanner;

// Interface
interface Shape {
    double calculateArea();
}

// Circle Class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square Class
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        // Polymorphism
        Shape s1 = new Circle(radius);
        Shape s2 = new Square(side);

        // Output
        System.out.println("\n--- Results ---");
        System.out.println("Area of Circle: " + s1.calculateArea());
        System.out.println("Area of Square: " + s2.calculateArea());

        sc.close();
    }
}