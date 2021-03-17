package TasksFromChap4;

import java.util.Scanner;
/***
 * Chapter 4, task 4.33
 * Не понял , что значит составное условие , сделал как понял
 * */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ((n % 10) % 2 == 0) {
            System.out.println("Последняя цифра четная");
        } else
            System.out.println("Последняя цифра нечетная");
    }
}
