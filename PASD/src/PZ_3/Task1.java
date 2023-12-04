package PZ_3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        // Створення вхідних списків
        List<Integer> list1 = List.of(1, 4, 8, 9, 11, 15, 17, 28, 41, 59);
        List<Integer> list2 = List.of(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81);

        // Виклик методу intersect та отримання результату
        List<Integer> result = intersect(list1, list2);

        // Виведення результату
        System.out.println(result);
    }

    // Метод для знаходження спільних елементів двох відсортованих списків
    public static List<Integer> intersect(List<Integer> list1, List<Integer> list2) {
        // Створення списку для результату
        List<Integer> resultList = new ArrayList<>();

        // Індекси для проходження по спискових масивах
        int i = 0;
        int j = 0;

        // Цикл, який проходиться по обох спискових масивах
        while (i < list1.size() && j < list2.size()) {
            // Отримання значень на поточних позиціях
            int value1 = list1.get(i);
            int value2 = list2.get(j);

            // Порівняння значень та додавання спільних елементів до результату
            if (value1 == value2) {
                resultList.add(value1);
                i++; // Збільшення індексу для list1
                j++; // Збільшення індексу для list2
            } else if (value1 < value2) {
                i++; // Збільшення індексу для list1
            } else {
                j++; // Збільшення індексу для list2
            }
        }

        // Повернення списку зі спільними елементами
        return resultList;
    }
}

