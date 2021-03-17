package Begin;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        double Tf, Tc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("temperatura v gradusah ");
        Tf = scanner.nextDouble();
        Tc = (Tf-32)*5/9;
        System.out.println("Znacheniya temperatury v gradusaah selsii " + Tc);

    }
}
