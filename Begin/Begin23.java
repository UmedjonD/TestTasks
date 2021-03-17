package Begin;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A,B,C,temp;
        System.out.println("A = ");
        A = scanner.nextDouble();
        System.out.println("B = ");
        B = scanner.nextDouble();
        System.out.println("C = ");
        C = scanner.nextDouble();
        temp = A;
        A = B;
        B = C;
        C = temp;
        System.out.println(" A = " + A);
        System.out.println(" B = " + B);
        System.out.println(" C = " + C);
    }
}
