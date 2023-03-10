import java.util.ArrayList;

// Вывести все простые числа от 1 до 1000
// Просто́е число́ — натуральное число, имеющее ровно два различных натуральных делителя.
// Последовательность простых чисел начинается так:
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 ...
// Простое число — это натуральное число больше 1, у которого есть всего два делителя: единица и само число. 

public class Task_002 {
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(String.format("%d  ", i));
            }
            count = 0;
        }
        System.out.println();


        System.out.println("Через list");
        ArrayList<Integer> primeNumber = new ArrayList<Integer> ();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumber.add (i);
            }
            count = 0;
        }
        System.out.println(primeNumber);

    }
}
