interface Interface1 {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method from Interface1");
    }
    default void methodWithBody() {
        System.out.println("Method with body from Interface1");
    }
}

// Second interface
interface Interface2 {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method from Interface2");
    }

    default void methodWithBody() {
        System.out.println("Method with body from Interface2");
    }
}

class Child implements Interface1, Interface2 {
    public void abstractMethod() {
        System.out.println("Abstract method implemented in Child class");
    }

    @Override
    public void defaultMethod() {
        Interface1.super.defaultMethod();
    }

    @Override
    public void methodWithBody() {
        Interface1.super.methodWithBody();
    }

    void callDefaultMethods() {
        Interface1.super.defaultMethod();
        Interface2.super.defaultMethod();
    }
}

public class Question7 {
    public static void main(String[] args) {
        Child child = new Child();
        child.defaultMethod();
        child.callDefaultMethods();
        child.methodWithBody();
    }
}
