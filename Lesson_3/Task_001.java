// Реализовать алгоритм сортировки слиянием.

package Lesson_3;

import java.util.Arrays;

public class Task_001 {
    public static void main(String[] args) {
        int[] arrayNum = {1, 4, 5, 3, 9, 7, 2, 7, 9, -5, 123, 44};

        System.out.println(Arrays.toString(arrayNum));
        sortMerge(arrayNum);
        System.out.println(Arrays.toString(arrayNum));
    }

    private static void sortMerge(int[] arraySort) {
        int size = arraySort.length;

        int middle = size / 2;
        if (size == 1) return;

        int [] left = new int[middle];
        int [] right = new int[size - middle];

        for (int i = 0; i < left.length; i++) {
            left[i] = arraySort[i];
        }
        for (int i = middle; i < size; i++) {
            right[i - middle] = arraySort[i];
        }

        sortMerge(left);
        sortMerge(right);
        merge(arraySort, left, right);
    }

    private static void merge(int [] arraySort, int [] left, int [] right) {
        int lengthLeft = left.length;
        int lengthRight = right.length;
        int indexLeft = 0;
        int indexRight = 0;
        int idx = 0;

        while (indexLeft < lengthLeft && indexRight < lengthRight) {
            if (left[indexLeft] < right[indexRight]){
                arraySort[idx] = left[indexLeft];
                indexLeft++;
                idx++;
            } else {
                arraySort[idx] = right[indexRight];
                indexRight++;
                idx++;
            }
        }

        for (int ll = indexLeft; ll < lengthLeft; ll++) {
            arraySort[idx] = left[ll];
            idx++;
        }

        for (int rr = indexRight; rr < lengthRight; rr++) {
            arraySort[idx] = right[rr];
            idx++;
        }
    }
}
