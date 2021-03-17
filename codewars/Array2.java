package codewars;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Object.*;

//reverse array
public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
//        int k = 0, l = 0;
        int[] arr = new int[n];
//        int[] arr2 = new int[n];
//
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
//
//        n = n - 1;
//        for (int i = n; i >= 0; i--) {
//            arr2[n - i] = arr[i];
//        }

        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));


    }
}
