// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


package Lesson_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task_002 {
    private static Logger logger = Logger.getLogger(Task_002.class.getTypeName());
    public static void main(String[] args) throws IOException {
        int[] array = {1, 4, 5, 3, 9, 7, 2, 7, 9};
        System.out.println(Arrays.toString(array));
        bubbleSort (array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort (int[] array) throws IOException {
        FileHandler fh = new FileHandler("Lesson_2/log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        for (int ceiling = array.length; ceiling >= 0; ceiling--) {
            for (int i = 0; i < ceiling && i + 1 < ceiling; i++){
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    logger.log (Level.INFO, String.format ("%d <-> %d, %s", array[i], array[i + 1], Arrays.toString(array)));
                }
            }
        }
    }
}
