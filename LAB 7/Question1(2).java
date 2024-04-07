import java.util.Scanner;

class Shape{

    int getArea(){
        return 0;
    }
}

class Rectangle extends Shape{
    int width,length;
    int getArea() {
        return width*length;
    }
}

class Box extends  Rectangle{
    int height;
    int getArea(){
        return 2*(width*length + length*height + width*height);
    }
}

public class Question1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Shape s = new Shape();
    s.getArea();
    Rectangle obj = new Rectangle();
    obj.width = sc.nextInt();
    obj.length = sc.nextInt();
    System.out.println(obj.getArea());

    Box obj2 = new Box();
    obj2.width = sc.nextInt();
    obj2.length = sc.nextInt();
    obj2.height = sc.nextInt();
    System.out.println(obj2.getArea());
    }
}