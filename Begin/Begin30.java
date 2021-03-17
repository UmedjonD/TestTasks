package Begin;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, degree;
        System.out.println("ugl v radianakh ");
        a = scanner.nextDouble();
        degree = (180 * a) / 3.14;
        System.out.println("Znacheniya ugla v gradusakh " + degree);
    }
}
