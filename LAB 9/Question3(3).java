import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
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
        int max = -200000000;
        int min = 200000000;
        for(int i = 0 ; i < arr3.size(); i++){
            if(arr3.get(i) > max){
                max = arr3.get(i);
            }
            if(arr3.get(i) < min){
                min = arr3.get(i);
            }
        }

        System.out.println("MAX element is : " + max + " Min element is : " +min);

    }
}
