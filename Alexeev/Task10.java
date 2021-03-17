package Alexeev;

import java.util.Scanner;

//Uravnenie
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        for (int x=-100; x<=100; x++) {
            if ((a*Math.pow(x,3)+b*x*x+c*x+d)==0) {
                System.out.print(x + " ");
            }
        }
    }
}
