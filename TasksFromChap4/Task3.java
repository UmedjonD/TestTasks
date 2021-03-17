package TasksFromChap4;

import java.util.Scanner;
/**
 * Chapter 4, task 4.36
 * Работа светофора для пешеходов запрограммирована следующим образом:
 * в начале каждого часа в течение трех минут горит зеленый сигнал, затем в те-чение двух минут—красный,
 * в течение трех минут—опять зеленый и т.д. Дано вещественное число t, означающее время в минутах,
 * прошедшее с нача-ла очередного часа. Определить, сигнал какого цвета горит для пешеходов в этот момент
 * */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();

        if (t % 5 >= 0.0 && t % 5 < 3.0)
            System.out.println("green");
        if (t % 5 >= 3.0 && t % 5 <= 5.0)
            System.out.println("red");

    }
}
