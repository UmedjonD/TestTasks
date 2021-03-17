package TasksFromChap10;

import java.util.Scanner;

/***
 * Chapter 10, task 10.51
 * последний метод по началу был не понятным, но разобрался =)*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        procedure1(n);
        System.out.println("end method 1");
        procedure2(n);
        System.out.println("end method 2");
        procedure3(n);
        System.out.println("end method 3");
    }
    //вывод 3 2 1
    static void procedure1(int n) {
        if (n > 0) {
            System.out.println(n);
            procedure1(n-1);
        }
    }
    //вывод 1 2 3
    static void procedure2(int n) {
        if (n > 0) {
            procedure2(n-1);
            System.out.println(n);
        }
    }
    //вывод 3 2 1 0 1 2 3
    static void procedure3(int n) {
        if (n > 0) {
            System.out.println(n);
            procedure3(n-1);
        }
        System.out.println(n);
    }
}
