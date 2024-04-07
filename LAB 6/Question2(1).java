class Student1{
    String Student_name;
    int Student_Roll;
    int Student_fee;
    Student1(){
        this("NULL", 00 , 000000);
    }


    Student1(String Student_name, int Student_Roll, int Student_fee){
        this.Student_name = Student_name;
        this.Student_Roll = Student_Roll;
        this.Student_fee = Student_fee;
    }



    void Show(Object obj){
        System.out.println("Student name : "+this.Student_name);
        System.out.println("Student roll number : "+this.Student_Roll);
        System.out.println("Tuition Fee : "+this.Student_fee);
    }

    void Display(){
        Show(this);
    }
}



public class Question2 {
    public static void main(String[] args) {
        Student1 obj1 = new Student1("Tejashvi", 65 , 100000);
        Student1 obj = new Student1();
        obj.Display();
        obj1.Display();
    }
}