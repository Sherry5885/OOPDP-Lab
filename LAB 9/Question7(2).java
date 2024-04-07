import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        boolean[] visited = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                visited[str.charAt(i) - 'a'] = true;
            }
        }
        boolean flag = false;
        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                System.out.println("Missing character: " + (char) ('a' + i));
                flag = true;
            }
        }
        if(!flag){
            System.out.println("All characters are present in the string");
        }
    }
}