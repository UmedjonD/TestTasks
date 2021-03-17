package TasksFromChap10;

import java.util.Scanner;

/**
 * Chapter 10, task 10.41
 * */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Факториал n = " + fact);
    }
}
