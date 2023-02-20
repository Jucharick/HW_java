// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой


package Lesson_3;

import java.util.ArrayList;

public class Task_004 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(7);
        numbers1.add(5);
        numbers1.add(3);
        numbers1.add(2);
        numbers1.add(14);
        numbers1.add(22);
        numbers1.add(23);
        numbers1.add(27);

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(7);
        numbers2.add(9);
        numbers2.add(27);
        numbers2.add(3);
        numbers2.add(13);
        numbers2.add(14);

        System.out.println(numbers1);
        System.out.println(numbers2);
        System.out.println("A - B");
        System.out.println(findDifference(numbers1, numbers2));
        System.out.println("B - A");
        System.out.println(findDifference(numbers2, numbers1));
        System.out.println("A ^ B");
        System.out.println(findSymmetricDifference(numbers1, numbers2));
    }

    private static ArrayList<Integer> findDifference(ArrayList<Integer> numbers1, ArrayList<Integer> numbers2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
            for (int i = 0; i < numbers1.size(); i++) {
                int pos = numbers2.indexOf((numbers1.get(i)));
                if (pos < 0 ) {
                    result.add(numbers1.get(i));
                }
            }
        return result;
    }

    private static ArrayList<Integer> findSymmetricDifference(ArrayList<Integer> numbers1, ArrayList<Integer> numbers2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < numbers1.size(); i++) {
            int pos = numbers2.indexOf((numbers1.get(i)));
            if (pos < 0 ) {
                result.add(numbers1.get(i));
            }
        }
        for (int i = 0; i < numbers2.size(); i++) {
            int pos = numbers1.indexOf((numbers2.get(i)));
            if (pos < 0 ) {
                result.add(numbers2.get(i));
            }
        }
        return result;
    }

}
