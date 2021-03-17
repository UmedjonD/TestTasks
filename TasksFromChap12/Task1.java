package TasksFromChap12;

/**
 * Chapter 12, task 12.23
 * выглядит жутко , ненавижу двумерные массивы
 */
public class Task1 {
    public static void main(String[] args) {
        int[][] arr = versionA();
        int[][] arr2 = versionB();
        int[][] arr3 = versionC();

        printMatrix(arr);
        System.out.println("----------------");
        printMatrix(arr2);
        System.out.println("----------------");
        printMatrix(arr3);

    }

    /**
     * вариант А
     */
    public static int[][] versionA() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        int n = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length; j >= 0; j--) {
                if (j - i == n) {
                    arr[i][j] = 1;
                }
            }
            n = n - 2;
        }
        return arr;
    }

    /**
     * вариант В
     */
    public static int[][] versionB() {
        int[][] arr = new int[7][7];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 3) {
                    arr[i][j] = 1;
                }
                if (i == 3) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }

        int n = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length; j >= 0; j--) {
                if (j - i == n) {
                    arr[i][j] = 1;
                }
            }
            n = n - 2;
        }
        return arr;
    }

    /**
     * Вариант С
     */
    public static int[][] versionC() {
        int[][] arr = new int[7][7];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 3) {
                    arr[i][j] = 1;
                }
                if (arr[i][j] == 3) {
                    arr[i][j] = 1;
                }
                if (i == 0) {
                    arr[i][j] = 1;
                }
                if (i == 1 && j>1 && j<6) {
                    arr[i][j] = 1;
                }
                if (i ==5 && j>1 && j<6) {
                    arr[i][j] = 1;
                }
                if (i == 6 && j>0 && j<6) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }

        int n = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length; j >= 0; j--) {
                if (j - i == n) {
                    arr[i][j] = 1;
                }
            }
            n = n - 2;
        }
        return arr;
    }

    /**
     * метод для вывода всех матриц
     */
    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }

}