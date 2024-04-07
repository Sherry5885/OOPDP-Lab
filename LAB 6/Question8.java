import java.util.Scanner;

class Circle{
    double radius;

    double area(){
        return 3.14*radius*radius;
    }
    void set_width(double r){
        this.radius = r;
    }
    double perimeter(){
        return 2.0*3.14*radius;
    }
    double circumference(){
        return 0.0;
    }
}

class Cyliner extends Circle{
    double height;
    double volume(){
        double area = area();
        return height*area;
    }
}

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cyliner c = new Cyliner();
        System.out.println("Enter r: ");
        c.radius = sc.nextDouble();
        System.out.println("Enter Height: ");
        c.height = sc.nextDouble();
        System.out.println("Cyliner Surface area: "+c.area());
        System.out.println("Cyliner Volume: "+c.volume());
    }
}
