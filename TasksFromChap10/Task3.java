package TasksFromChap10;

import java.util.Scanner;

/***
 * Chapter 10, task 10.53
 */
public class Task3 {
    public static void main(String[] args) {
        recursiaProcuedure();
        System.out.println();
    }

    static void recursiaProcuedure() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n != 0) {
            recursiaProcuedure();
        }
        System.out.println(n);

    }
}
