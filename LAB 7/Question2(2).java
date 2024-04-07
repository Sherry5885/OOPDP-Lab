import java.util.Scanner;
class Circle{
    double radius;
    double area(){
        return 2 * 3.14 * radius * radius;
    }

    void set_width(double radius){
        this.radius = radius;
    }

    double perimeter(){
        return 2*3.14*radius;
    }

    double circumference(){
        return 2*3.14*radius;
    }
}

class Cylinder extends Circle{
    double height;
    double volume(){
        double ar = this.area();
        return  height*ar;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        double a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        obj.set_width(a);
        System.out.println("Area:"+obj.area());
        obj.height = sc.nextInt();
        System.out.println("Perimeter: "+obj.circumference());
        System.out.println("volume: "+obj.volume());


    }
}
