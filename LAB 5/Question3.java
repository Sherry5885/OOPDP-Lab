package lab4;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;



public class Question3 {
    
    public  static class Student {
        
    private int student_roll;
    private String student_name;
    private int[] student_marks = new int[5];
    
    public Student() {
        this.student_roll = 0;
        this.student_name = "Unknown";
        for (int i = 0; i < student_marks.length; i++) {
            student_marks[i] = 0;
        }
    }
    
    public Student(int roll, String name, int[] marks) {
        this.student_roll = roll;
        if (name == null || name.isEmpty()) {
            this.student_name = "Unknown";
        } else {
            this.student_name = name;
        }
        for (int i = 0; i < student_marks.length; i++) {
            if (i < marks.length) {
                this.student_marks[i] = marks[i];
            } else {
                this.student_marks[i] = 0;
            }
        }
    }
    
    public int getStudent_roll() {
        return student_roll;
    }
    
    public String getStudent_name() {
        return student_name;
    }
    
    public int[] getStudent_marks() {
        return student_marks;
    }
    }
    
    
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student 1:");
        System.out.println("Roll: " + student1.getStudent_roll());
        System.out.println("Name: " + student1.getStudent_name());
        System.out.println("Marks: " + Arrays.toString(student1.getStudent_marks()));
        
        int[] marks = {90, 80, 70, 60, 50};
        Student student2 = new Student(1, "John Doe", marks);
        System.out.println("\nStudent 2:");
        System.out.println("Roll: " + student2.getStudent_roll());
        System.out.println("Name: " + student2.getStudent_name());
        System.out.println("Marks: " + Arrays.toString(student2.getStudent_marks()));
    }
    
}
