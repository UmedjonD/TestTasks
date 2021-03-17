package TasksFromChap2;

import java.util.Scanner;
/**
 * Chapter 2, task 2.43
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result1 = a % b;
        int result2 = b % a;
        System.out.println(result1 * result2 + 1);
    }
}
