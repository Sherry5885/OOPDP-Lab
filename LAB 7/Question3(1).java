import java.util.Scanner;
class Rectangle1{
    int length , width;
    Rectangle1(){
        this.length = 1;
        this.width = 1;
    }
    Rectangle1(int length, int width){
        this.length = length;
        this.width = width;
    }
}

class Cuboid extends Rectangle1{
    int height;
    Cuboid(){
        this.height = 1;
    }
    Cuboid(int length, int width,int height){
        super(length,width);
        this.height = height;
    }

    int volume(){
        return length*width*height;
    }

}
public class Question3 {
    public static void main(String[] args) {
    Cuboid obj1 = new Cuboid();
    System.out.println(obj1.volume());
    int a , b , c;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    Cuboid obj2 = new Cuboid(a, b ,c);
    System.out.println("Volume: "+obj2.volume());
    }
}
