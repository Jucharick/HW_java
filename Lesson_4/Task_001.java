// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


package Lesson_4;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Task_001 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(23);
        numbers.add(1);
        numbers.add(8);
        numbers.add(9);
        numbers.add(3);
        numbers.add(5);

        System.out.println(numbers);
        getArrayDeque(numbers);

    }
    private static void getArrayDeque (LinkedList<Integer> array){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < array.size(); i++) {
            deque.push(array.get(i));
        }
        System.out.println(deque);
    }
}
