import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of element in array1");
        int n = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr1.add(sc.nextInt());
        }
        System.out.println("Number of element in array2");
        int n2 = sc.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<Integer>(n2);

        System.out.println("Enter the elements");
        for (int i = 0; i < n2; i++) {
            arr2.add(sc.nextInt());
        }

        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
                arr3.add(arr1.get(i));
        }

        for (int i = 0; i < n2; i++) {
            arr3.add(arr2.get(i));
        }

        System.out.println("Enter a value to check: ");
        int value =sc.nextInt();
        if (arr3.contains(value)) {
            System.out.println(value + " is present in the first array list.");
        } else {
            System.out.println(value + " not present");
        }
    }
}