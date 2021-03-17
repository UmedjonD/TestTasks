package TasksFromChap10;

import java.util.Scanner;

/***
 * Chapter 10, task 10.56
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        checkSimpleDigit(n);
    }

    static void checkSimpleDigit(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (n>0) {
            checkSimpleDigit(n - 1);
        }
        if (flag) System.out.println("число " + n + " простое");
        else System.out.println("число " + n + " не простое ");
    }
}
