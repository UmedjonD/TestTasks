package TasksFromChap3;

import java.util.Scanner;

/**
 * Chapter 3, task 3.29
 * */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        //a
        if (x % 2 != 0 & y % 2 != 0) {
            System.out.println("if true out this line");
        }
        //б
        if (x <= 2 || y <= 2) {
            System.out.println("if true");
        }
        //в
        if ((x == 0 & y != 0) || (y == 0 & x != 0)) ;
        System.out.println("черех ||");

        //г
        if (x < 0 & y < 0 & z < 0) ;
        System.out.println("Через один & проверяет каждую переменную");

        //д , кратно 3
        if ((x%3 == 0 & y%3 != 0 & z%3 != 0) || (y%3 == 0 & x%3 != 0 & z%3 != 0) || (z%3 == 0 & y%3 != 0 & x%3 != 0))  {
            System.out.println("только одно из чисел кратно 3");
        }
        //e
        if ((x > 100 & y < 100 & z < 100) || (y > 100 & x < 100 & z < 100) || (z > 100 & y < 100 & x < 100)) {
            System.out.println("хотя бы одно из  чисел больше 100");
        }

    }
}
