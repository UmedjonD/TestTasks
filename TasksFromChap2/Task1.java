package TasksFromChap2;

import java.util.Scanner;

/**
 * Chapter 2, task 2.13
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        int n1, n2, n3;

        if (!(n < 200 && n > 100)) {
            System.out.println("Введите в диапазоне от 100 до 200");
            return;
        }
        //Первый способ
        int reverse = ((n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100));
        System.out.println(reverse);

        //Второй способ
        System.out.println(n1 = (n % 100) % 10);
        n2 = (n % 100) * 100 / 1000;
        n3 = (n / 100);
        System.out.println(n1 + "" + n2 + "" + n3);
    }
}
