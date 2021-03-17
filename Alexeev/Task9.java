package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

//DZ
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int summa = 0, min, max, p = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            min = arr[0];

            if (arr[i] > 0) {
                summa += arr[i];
            }
        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        if (max > min) {
            for (int i = min; i < max - 1; i++) {
                p *= arr[i];
            }
        } else {
            for (int i = max + 1; i > min - 1; i--) {
                p *= arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("summa = " + summa);
        System.out.println("proiz = " + p);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
