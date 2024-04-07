/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

public class Question4 {
    private int student_roll;
    private String student_name;
    private double[] student_marks;

    public Question4(int student_roll, String student_name, double[] student_marks) {
        this.student_roll = student_roll;
        this.student_name = student_name;
        this.student_marks = student_marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : student_marks) {
            sum += mark;
        }
        return sum / student_marks.length;
    }

    public void printStudentDetails() {
        System.out.println("Student Roll: " + student_roll);
        System.out.println("Student Name: " + student_name);
        System.out.println("Average Marks: " + calculateAverage());
    }

    public static void main(String[] args) {
        Question4 student1 = new Question4(1, "John Doe", new double[]{85, 90, 78, 92, 88});
        Question4 student2 = new Question4(2, "Jane Doe", new double[]{90, 85, 88, 95, 89});
        Question4 student3 = new Question4(3, "Mark Smith", new double[]{78, 80, 85, 90, 87});

        student1.printStudentDetails();
        System.out.println();
        student2.printStudentDetails();
        System.out.println();
        student3.printStudentDetails();
    }
}