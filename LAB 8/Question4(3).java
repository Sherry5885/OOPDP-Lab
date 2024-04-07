interface Person {
    int age = 30;
    void displayInfo();
    static void showAge() {
        System.out.println("Age: " + age);
    }
}

class Employee implements Person {
    public void displayInfo() {
        System.out.println("Employee Information");
    }
}

public class Question4 {
    public static void main(String[] args) {
        System.out.println(Person.age);
        Employee obj = new Employee();
        obj.displayInfo();
        Person.showAge();
    }
}
