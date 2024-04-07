abstract class Base1 {
    abstract class Base2 {
        abstract void display();
    }
}

class Derived1 extends Base1 {
    class Derived2 extends Base2 {
        void display() {
            System.out.println("Happy Holi");
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        Derived1 obj1 = new Derived1();
        Derived1.Derived2 obj2 = obj1.new Derived2();
        obj2.display();
    }
}