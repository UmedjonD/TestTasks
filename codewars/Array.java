package codewars;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int[] arr = new  int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i<n1; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i<n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        for (int i = 0; i<n1; i++) {
            for (int j = 0; j<n2; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
