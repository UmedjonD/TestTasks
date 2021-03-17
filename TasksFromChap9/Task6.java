package TasksFromChap9;

/**
 * Chapter 9, task 9.166
 */
public class Task6 {
    public static void main(String[] args) {
        String str = "Привет че кого как оно";
        String[] pasts = str.split(" ");
        String firstword = "";
        String lastword = "";

        System.out.println("ДО");
        for (int i = 0; i < pasts.length; i++) {
            System.out.print(pasts[i] + " ");
            firstword = pasts[0];
            lastword = pasts[pasts.length-1];
        }

        pasts[0] = lastword;
        pasts[pasts.length-1] = firstword;

        System.out.println("\nПОСЛЕ");
        for (String s : pasts) {
            System.out.print(s + " ");
        }
    }
}
