package Alexeev;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 10 == 5) {
            System.out.println(Math.pow(a,2));
        } else {
            System.out.println("число не оканчивается на 5");
        }


    }
}
