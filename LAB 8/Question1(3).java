class Outer {
    int x = 10;
    static int var = 20;
    class Inner {
        void Display0() {
            System.out.println(x);
        }
    }
    void InnerMethod() {
        int Y = 30;
        class LocalInner {
            void Display() {
                System.out.println(Y);
            }
        }
        LocalInner obj = new LocalInner();
        obj.Display();
    }
    static class StaticClass {
        void Display() {
            System.out.println(var);
        }
    }
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        Outer.Inner Obj2 = obj1.new Inner();
        Obj2.Display0();
        obj1.InnerMethod();
        StaticClass Obj3 = new StaticClass();
        Obj3.Display();
    }
}