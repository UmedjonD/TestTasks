package TasksFromChap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Chapter 4, task 4.115
 * Решил делать с помощью коллекции , можно было бы сделать массивом, захотелось лист использовать =)
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> animalsList = returnAnimalList();
        List<String> fiftElement = returnFiftElementList();
        int year = scanner.nextInt();

        if (year >= 1984  && year < 2020) {
            int count = year - 4;
            System.out.println(animalsList.get((count) % 12) + " " + fiftElement.get((count) % 10 / 2));
        } else {
            System.out.println("Error: Введите в деапазоне от 1984 до 2020");
        }
    }

    public static List<String> returnAnimalList() {
        List<String> animals = new ArrayList<>();
        animals.add("Крыса");
        animals.add("Корова");
        animals.add("Тигр");
        animals.add("Заяц");
        animals.add("Дракон");
        animals.add("Змея");
        animals.add("Лошадь");
        animals.add("Овца");
        animals.add("Обезьяна");
        animals.add("Петух");
        animals.add("Собака");
        animals.add("Свинья");
        return animals;
    }

    public static List<String> returnFiftElementList() {
        List<String> elements = new ArrayList<>();
        elements.add("Зеленый");
        elements.add("Красный");
        elements.add("Желтый");
        elements.add("Белый");
        elements.add("Черный");
        return elements;
    }
}
