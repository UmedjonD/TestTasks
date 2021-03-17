package codewars;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i=0; i<10; i++){
            list.add(i);
        }
        System.out.println(list);

        for (int i = 2; i <10; i++){
            list2.add(i);
        }
        System.out.println(list2);


        System.out.println(list.get(5));

        System.out.println(list2.get(3));
    }
}
