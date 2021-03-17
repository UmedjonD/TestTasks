package TasksFromChap9;

/**
 * Chapter 9, task 9.107
 * */
public class Task5 {
    public static void main(String[] args) {
        String str = "Саламон";
        System.out.println(str);

        char[] ch = str.toCharArray();
        int a = 0;
        int o = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'а') {
                a = i;
                break;
            }
        }
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == 'о') {
                o = j;
            }
        }

        if (a == 0 && o == 0) {
            System.out.println("нет буквы о и а ");
        }
        else {
            ch[a] = 'о';
            ch[o] = 'а';
            System.out.println(ch);
        }
    }
}
