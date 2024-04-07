import java.util.Scanner;

abstract class Shape {
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double perimeter() {
        return 2 * (length + breadth);
    }
    double area() {
        return length * breadth;
    }
}

public class Question3 {
    public static void main(String[] args) {
        int a , b, r;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        Rectangle obj1 = new Rectangle(a, b);
        System.out.println("Area: " + obj1.area());
        System.out.println("Perimeter: " + obj1.perimeter());

        r = sc.nextInt();
        Circle obj2 = new Circle(r);
        System.out.println("Area: " + obj2.area());
        System.out.println("Perimeter: " + obj2.perimeter());
    }
}
