package codewars;

import java.util.Arrays;
import java.util.Scanner;

public class AreaorPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int [n];

        for(int i=0; i<n; i++) {
            array[i]= scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

    }
}
