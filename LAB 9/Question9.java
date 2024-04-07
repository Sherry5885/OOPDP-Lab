import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int length = Math.min(str1.length(), str2.length());

        for (int i = 0; i < length; i++) {
            int diff = (int) str1.charAt(i) - (int) str2.charAt(i);

            if (diff > 0) {
                System.out.println("Positive");
                break;
            } else if (diff < 0) {
                System.out.println("Negative");
                break;
            } else {
                System.out.println("0");
            }
        }

        if (str1.length() > length) {
            System.out.println("Positive");
        } else if (str2.length() > length) {
            System.out.println("Negative");
        }
    }
}