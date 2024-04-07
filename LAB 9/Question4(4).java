import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
            return;
        }

        char[] chararr1 = str1.toCharArray();
        char[] chararr2 = str2.toCharArray();

        Arrays.sort(chararr1);
        Arrays.sort(chararr2);

        boolean areAnagrams = Arrays.equals(chararr1, chararr2);

        if (areAnagrams) {
            System.out.println("anagrams words");
        } else {
            System.out.println("not anagrams words");
        }
    }
}