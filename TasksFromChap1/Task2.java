package TasksFromChap1;

/**
 * chapter 1, task number 1.17
 */
public class Task2 {
    public static void main(String[] args) {

        int x1 = 3, x2 = 4;
        int a = 2, b = 5, c = 1;

        //вариант А)
        double result = Math.sqrt((x1 * x1) + (x2 * x2));
        System.out.println("Результат №1 = " + result);

        //вариант О)
        double result2 = Math.sqrt(1 - Math.pow(Math.sin(x1), 2));
        System.out.println("Результат №2 = " + result2);

        //вариант П
        double result3 = 1 / Math.sqrt(Math.pow(a * x1, 2) + (b * x1) + c);
        System.out.println("Результат №3 = " + result3);

        //вариант Р
        double result4 = ((Math.sqrt(x1 + 1) + Math.sqrt(x1 - 1)) / 2 * Math.sqrt(x1));
        System.out.println("Результат №4 = " + result4);

        //вариант С
        double result5 = (Math.abs(x1) + Math.abs(x1 + 1));
        System.out.println("Результат №5 = " + result5);

        //вариант T
        double result6 = Math.abs(1 - Math.abs(x1));
        System.out.println("Результат №6 = " + result6);
    }
}
