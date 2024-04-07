package lab4;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

class Car {
    private String brand;
    
    public Car() {
        this.brand = "Ford";
    }
    
    public String getBrand() {
        return brand;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Car car = new Car();
        String brand = car.getBrand();
        System.out.println("Brand: " + brand);
    }
}
