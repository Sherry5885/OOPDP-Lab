package lab4;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static class Employee{
        public int Employee_id;
        public String Employee_name;
        public String Employee_department;
        
        public Employee(){  // Constructor to take input
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter Employee ID: ");
            this.Employee_id = sc.nextInt();
            
            System.out.println("Enter Employee Name: ");
            this.Employee_name = sc.nextLine();
            
            System.out.println("Enter Employee Department: ");
            this.Employee_department = sc.nextLine();   
        }
    }
    
    public static void main(String[] args) {
        Employee employeedata = new Employee();
        
        System.out.println("Employee ID: " + employeedata.Employee_id);
        System.out.println("Employee Name: " + employeedata.Employee_name);
        System.out.println("Employee Department: " + employeedata.Employee_department);
    }
}