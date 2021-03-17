package Alexeev;

import java.util.Scanner;

public class Misol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();

        int b = 0;
        int c = 0;
        int sek = 0;
        int count = 0;

        if (h1 >= 0 && h1 < 12 && m1 > 0 && m1 < 60 && h2 >= 0 && h2 < 12 && m2 > 0 && m2 < 60) {
//            b = h1%12;
//            c = h2%12;
//
//            if (m1%30 == 0) b++;
//            if (m2%30 == 0) c++;
//            if (h1%12 == 0) b++;
//            if (h2%12 == 0) c++;
            
            for (int i = 0; i<sek; i++) {
                if (i % 3600 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);


        System.out.println(b + " " + c);
    }
}
