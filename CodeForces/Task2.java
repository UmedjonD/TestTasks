package CodeForces;

import java.util.Scanner;

/***
 * Лопаты и мечи
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=0; i<n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(Math.min(Math.min(a,b),(a+b)/3));
        }
    }
}
