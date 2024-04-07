import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = 0;

        while (index < str.length() && str.charAt(index) == '0') {
            index++;
        }

        if (index > 0) {
            int length = str.length();
            for (int i = index; i < length; i++) {
                str = str.substring(i, i + 1) + str.substring(0, i);
            }
            str = str.substring(index);
        }

        System.out.println(str);
    }
}