package Alexeev;

public class DecToBin {
    public static void main(String[] args) {
        Integer number = 1452;

        // Бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println("Двоичный " + convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number);
        System.out.println("восмеричный " + convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number).toUpperCase();
        System.out.println("16-ричный " + convert);
    }
}
