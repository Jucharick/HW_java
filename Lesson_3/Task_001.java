// Реализовать алгоритм сортировки слиянием.

package Lesson_3;

import java.util.Arrays;

public class Task_001 {
    public static void main(String[] args) {
        int[] arrayNum = {1, 4, 5, 3, 9, 7, 2, 7, 9};

        System.out.println(Arrays.toString(arrayNum));
        System.out.println(Arrays.toString(sortMerge(arrayNum)));
    }

    private static int[] sortMerge(int[] array) {
        int[] temp;
        int[] currentSrc = array; // массив - источник, откуда мы сливаем массивы друг с другом
        int[] currentDest = new int[array.length]; // массив - приеник, куда мы заливаем результирующие массивы после слияния

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }
            temp = currentSrc;
            currentSrc = currentDest;
            currentDest = temp;
            size = size * 2;
        }
        return currentSrc;
    }

    private static void merge(int[] left, int leftStart, int[] right, int rightStart, int[] dest,
                              int destStart, int size) {
        int indexL = leftStart;
        int indexR = rightStart;

        int leftEnd = Math.min(leftStart + size, left.length);
        int right2End = Math.min(rightStart + size, right.length);

        if (leftStart + size > left.length) {
            for (int i = leftStart; i < leftEnd; i++) {
                dest[i] = left[i];
            }
            return;
        }

        int iterationCount = leftEnd - leftStart + right2End - rightStart; // сколько итераций цикла для объединения двух массивов - суммарное количество элементов в двух подмассивах

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (indexL < leftEnd && (indexR >= right2End || left[indexL] < right[indexR])) { // indexL < leftEnd && (indexR >= right2End - когда в первом или во втором массиве заканчиваются элементы
                dest[i] = left[indexL];
                indexL++;
            } else {
                dest[i] = right[indexR];
                indexR++;
            }
        }
    }
}
