package codewars;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        double one = scanner.nextFloat();
        double two = scanner.nextDouble();
        String line = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(ret(first, second));
        System.out.println(ret2(one,two));
        System.out.println(line+ " " + line2);
    }

    public static int ret(int a, int b) {
        return a + b;
    }

    public static double ret2(double a, double b) {
        return a-b;
    }
}

