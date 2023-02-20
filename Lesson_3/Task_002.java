// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Lesson_3;

import java.io.IOException;
import java.util.ArrayList;

public class Task_002 {
    public static void main(String[] args) throws IOException {
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
        deleteEvenNumbers (numbers);
        System.out.println(numbers);
    }

    private static void deleteEvenNumbers (ArrayList<Integer> numbers) throws IOException {
            for (int i = 0; i < numbers.size(); i++){
                if (numbers.get(i) % 2 == 0) {
                    numbers.remove(i);
                    i--;
                }
            }
    }
}
