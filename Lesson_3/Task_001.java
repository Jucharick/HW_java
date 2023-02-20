// Реализовать алгоритм сортировки слиянием.

package Lesson_3;

import java.util.Arrays;

public class Task_001 {
    public static void main(String[] args) {
        int[] arrayNum = {1, 4, 5, 3, 9, 7, 2, 7, 9};

        System.out.println(Arrays.toString(arrayNum));
        System.out.println(Arrays.toString(sortMerge(arrayNum)));
    }

    private static int[] sort(int[] array) {
        int startI = 0;
        int middleI = array.length / 2;
        int endI = array.length - 1;
        int[] result = new int [array.length / 2];
        while (startI < middleI && middleI + 1 <= endI) {
            
        }
    }

    private static int[] sortMerge (int[] array) {



        int i = 0; int j = 0; int k = 0;


        return array;
    }
}
