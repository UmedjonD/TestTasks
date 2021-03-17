package Begin;

import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        double Tf, Tc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("temperatura v gradusah selsii ");
        Tc = scanner.nextDouble();
        Tf = 9/5*Tc+32;
        System.out.println("Znacheniya temperatury v gradusaah frangeyta  ravno " + Tf);
    }
}
