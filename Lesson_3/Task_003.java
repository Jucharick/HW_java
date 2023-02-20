// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

package Lesson_3;

import java.util.ArrayList;

public class Task_003 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(14);
        numbers.add(22);
        numbers.add(23);
        numbers.add(27);

        System.out.println(numbers);
        System.out.printf("Max = %d\n", findMax (numbers));
        System.out.printf("Min = %d\n", findMin (numbers));
        System.out.printf("Average = %d\n", findAverage (numbers));
    }

    private static Integer findMax (ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    private static Integer findMin (ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    private static Integer findAverage (ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        int average = sum /numbers.size();
        return average;
    }
}
