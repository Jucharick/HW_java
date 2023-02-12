// Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.


import java.util.Scanner;

public class Task_004 {
    public static void main(String[] args) {
        System.out.println("Задано уравнение вида q + w = e, q, w, e >= 0.");
        System.out.println("Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите q: ");
        String q_string= iScanner.nextLine();
        System.out.printf("Введите w: ");
        String w_string = iScanner.nextLine();
        System.out.printf("Введите e: ");
        String e_string = iScanner.nextLine();
        
        boolean flag = true;
        
        for (int i = 0; i < 10; i++) {
            int q_num = Integer.parseInt(q_string.replace("?", Integer.toString(i)));
             for (int j =0; j < 10; j++) {
                int w_num = Integer.parseInt(w_string.replace("?", Integer.toString(j)));
                for (int j2 = 0; j2 < 10; j2++) {
                     int e_num = Integer.parseInt(e_string.replace("?", Integer.toString(j2)));
                    if (q_num + w_num == e_num) {
                        System.out.printf("Вариант решения уравнения: %s + %s = %s\n", q_string, w_string, e_string);
                        System.out.printf("%d + %d = %d\n", q_num, w_num, e_num);
                        flag = false;
                        break;
                     }
                }
                if (flag == false) break;
            }
            if (flag == false) break;
         } 
         if (flag) System.out.println("Решений нет!"); 

        iScanner.close();
    }
}
