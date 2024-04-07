import java.util.Scanner;
class  Base{
    void Display(){
        System.out.println("In Base");
    }
}
class Derived extends  Base{
    void Display(){
        System.out.println("In Derived");
    }
    void Show(){
        System.out.println("In Derived In Show");
    }
}
public class Question5 {
    public static void main(String[] args) {
        Base obj1 = new Derived();
        // obj1.Show();
        obj1.Display();
        Base obj2 = new Base();
        obj2.Display();
        Derived obj3 = new Derived();
        obj3.Show();
        obj3.Display();
    }
}
