package codewars;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println();

        int max_el = 1;
        int frq = 0;

        for (int i = 0; i<arr.length; i++) {
            frq = 1;

            for (int k = i+1; k<n; k++){
                if (arr[i] == arr[k]) {
                    frq += 1;
                }
                if (frq > max_el) {
                    max_el = frq;
                    num = arr[i];
                }
            }
        }
        if (max_el > 1) {
            System.out.println(max_el + " раза встречается число  " + num);
        } else {
            System.out.println("Все элементы уникальны! ");
        }

    }
}
