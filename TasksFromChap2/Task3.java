package TasksFromChap2;

import java.util.Scanner;

/**
 * Chapter 2, task 2.39
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Часы от 0 до 23 h = ");
        int hour = scanner.nextInt();
        System.out.print("Минуты от 0 до 59 m = ");
        int minute = scanner.nextInt();
        System.out.print("Секунды от 0 до 59 s = ");
        int second = scanner.nextInt();

        int conversion = hour * 3600 + minute * 60 + second;
        double degree = 360*conversion/12/3600;
        System.out.println("Угол в градусах = " + degree);


    }
}
