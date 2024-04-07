import java.util.Scanner;
class Rectangle2{
    int length , width;
    Rectangle2(){
        this.length = 1;
        this.width = 1;
    }
    Rectangle2(int length, int width){
        this.length = length;
        this.width = width;
    }
}

class Cuboid1 extends Rectangle1{
    int height;
    Cuboid1(){
        this.height = 1;
    }
    Cuboid1(int length, int width,int height){
        super(length,width);
        this.height = height;
    }

    int volume(){
        return length*width*height;
    }

}

class Cube extends Cuboid1{

}
public class Question4 {
    public static void main(String[] args) {
        Cuboid1 obj1 = new Cuboid1();
        System.out.println(obj1.volume());
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Cuboid1 obj2 = new Cuboid1(a, b ,c);
        System.out.println("Volume: "+obj2.volume());
    }
}
