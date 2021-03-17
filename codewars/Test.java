package codewars;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test test = new Test();

        int a = 4;
        int b = 8;
        System.out.println(getPer(a, b));
        System.out.println(getploshad(a, b));

    }

    public static int getploshad(int a, int b) {
        return a * b;
    }

    public static int getPer(int a, int b) {
        return 2 * (a + b);
    }

    public static char getChar(char a, char b) {
        return (char) (a + b);
    }

    public static String getString(String str, String str2) {
        return str + str2;
    }

    public void printHello() {
        System.out.println("end");
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int getMin(int a, int b) {
        return a < b ? a : b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }
}
