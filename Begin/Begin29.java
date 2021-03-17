package Begin;

import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, degree;
        System.out.println("ugl v gradusakh ");
        a = scanner.nextDouble();
        degree = 3.14 * a / 180;
        System.out.println("Znacheniya ugla v radionakh " + degree);
    }
}
