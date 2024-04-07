class Student2{
    String Student_name;
    int Student_Roll;
    int Student_fee;

    Student2(String Student_name, int Student_Roll, int Student_fee){
        this.Student_name = Student_name;
        this.Student_Roll = Student_Roll;
        this.Student_fee = Student_fee;
    }

    Object object(){
        return this;
    }

    Student2(){
        this("NULL", 00 , 000000);
    }

    void Show(Object object){
        System.out.println("Student name : "+this.Student_name);
        System.out.println("Student roll number : "+this.Student_Roll);
        System.out.println("Tuition Fee : "+this.Student_fee);

    }

    void Display(){
        Show(this);
    }
}



public class Question4 {
    public static void main(String[] args) {
        Student1 obj1 = new Student1("Tejashvi", 65 , 100000);
        Student1 obj = new Student1();
        obj.Display();
    }
}