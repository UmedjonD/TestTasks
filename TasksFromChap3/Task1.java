package TasksFromChap3;

import java.io.IOException;

/**
 *Chapter 3, task 3.26
 * Отрицание сделал через метод , не знаю можно было или нет, отрицание для интовых значение затруднился
 * Если вывод на консоль было бы true or false было бы легче , т.к хотел вывести 1 и 0 , сделал через метод =)
 * */
public class Task1 {
    public static void main(String[] args) throws IOException {
        boolean t = true, f = false;
        int intT = t ? 1 : 0;
        int intF = f ? 1 : 0;

        System.out.println("X\tY\tZ\t(X|Y)\t!(X|Y)\t!(!X&!Z)");
        System.out.println(intT + "\t" + intT + "\t" + intT + "\t  " + (intT | intT) + "\t " + "\t " + checkNotXorY(t, t) + "\t " + "\t " + checkNotXAndY(t,t));
        System.out.println(intT + "\t" + intT + "\t" + intF + "\t  " + (intT | intT) + "\t " + "\t " + checkNotXorY(t, t) + "\t " + "\t " + checkNotXAndY(t,f));
        System.out.println(intT + "\t" + intF + "\t" + intT + "\t  " + (intT | intF) + "\t " + "\t " + checkNotXorY(t, f) + "\t " + "\t " + checkNotXAndY(t,t));
        System.out.println(intT + "\t" + intF + "\t" + intF + "\t  " + (intT | intF) + "\t " + "\t " + checkNotXorY(t, f) + "\t " + "\t " + checkNotXAndY(t,f));
        System.out.println(intF + "\t" + intT + "\t" + intT + "\t  " + (intF | intT) + "\t " + "\t " + checkNotXorY(f, t) + "\t " + "\t " + checkNotXAndY(f,t));
        System.out.println(intF + "\t" + intT + "\t" + intF + "\t  " + (intF | intT) + "\t " + "\t " + checkNotXorY(f, t) + "\t " + "\t " + checkNotXAndY(f,f));
        System.out.println(intF + "\t" + intF + "\t" + intT + "\t  " + (intF | intF) + "\t " + "\t " + checkNotXorY(f, f) + "\t " + "\t " + checkNotXAndY(f,t));
        System.out.println(intF + "\t" + intF + "\t" + intF + "\t  " + (intF | intF) + "\t " + "\t " + checkNotXorY(f, f) + "\t " + "\t " + checkNotXAndY(f,f));

    }

    public static int checkNotXorY(boolean a, boolean b) {
        if (!(a | b)) {
            return 1;
        } else
            return 0;
    }
    public static int checkNotXAndY(boolean a, boolean b) {
        if (!(!a&!b)) return 1;
        else return 0;
    }
}
