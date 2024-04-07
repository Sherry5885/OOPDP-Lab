import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String str4 = sc.next();

        System.out.println("Using Equals: " + str1.equals(str2));
        System.out.println("Using Equal Ignore Case: " + str3.equalsIgnoreCase(str4));
        System.out.println("Using Compare To: " + str1.compareTo(str2));
        System.out.println("Using Compare To: " + str2.compareTo(str1));
    }
}