package TasksFromChap9;

/***
 *Chapter 9, task 9.185
 */
public class Task7 {
    public static void main(String[] args) {
        String line = "( 2 + 2 ) + ( 4 * 4 )";
        int left = 0, reght = 0;
        char[] chArr = line.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == '(') left++;
            if (chArr[i] == ')') reght++;
        }

        if (left == reght) {
            System.out.println("ДА");
        } else {
            System.out.println("НЕТ");
            if (left > reght) System.out.println("Количество " + "(" + " равно : " + left + " a ) равно : " + reght
                    +" закройте скобку");
            else System.out.println("Количество " + ")" + " равно : " + reght + " a ( равно: " + left
                    +" откройте скобку ");
        }
    }
}
