package codewars;

import java.util.Scanner;

public class Bool19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  =  scanner.nextInt();
        int b  =  scanner.nextInt();
        int c  =  scanner.nextInt();
        int s,g;

        s = a - b;
        g = a - c;

        if (s>g) {
            System.out.println("Nazdikrat " + g);
        } else {
            System.out.println("nazdiktar " + s);
        }

    }
}
