import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();

        boolean isPalindrome1 = true;
        boolean isPalindrome2 = true;

        for (int i = 0; i < length1 / 2; i++) {
            if (str1.charAt(i) != str1.charAt(length1 - i - 1)) {
                isPalindrome1 = false;
                break;
            }
        }

        for (int i = 0; i < length2 / 2; i++) {
            if (str2.charAt(i) != str2.charAt(length2 - i - 1)) {
                isPalindrome2 = false;
                break;
            }
        }

        if (isPalindrome1 && isPalindrome2) {
            String result = str1 + str2;
            System.out.println("The concatenated string is: " + result);
        } else {
            System.out.println("One or both of the strings are not palindromes.");
        }
    }
}