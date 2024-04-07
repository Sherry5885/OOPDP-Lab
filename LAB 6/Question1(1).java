import java.util.Scanner;

class Student{
    String Student_name;
    int Student_Roll;
    int Student_fee;

    Student(String Student_name, int Student_Roll, int Student_fee){
        this.Student_name = Student_name;
        this.Student_Roll = Student_Roll;
        this.Student_fee = Student_fee;
    }

    void Display(){
        System.out.println("Student name : "+this.Student_name);
        System.out.println("Student roll number : "+this.Student_Roll);
        System.out.println("Tuition Fee : "+this.Student_fee);
    }
}

public class Question1 {
    public static void main(String[] args) {
        String name ;
        int roll , fee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter roll : ");
        roll = sc.nextInt();
        System.out.println("Enter fee : ");
        fee = sc.nextInt();
        Student obj1 = new Student(name, roll, fee);
        obj1.Display();
    }
}