package codewars;

public class Codewars {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};
        System.out.println(oddOrEven(arr));
    }

    public static String oddOrEven (int[] array) {
        // your code
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
