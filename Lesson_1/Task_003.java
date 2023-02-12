// Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4


import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_003 {
    public static void main(String[] args) {
        System.out.printf("Введите первое число: ");
        Scanner iScanner = new Scanner(System.in, "cp866"); // "cp866" - кодировка позволяет принимать кириллицу, без этого аркумента можно написать имя только латинскими буквами
        double a = iScanner.nextFloat();
        System.out.printf("Введите  второе число: ");
        double b = iScanner.nextFloat();
        System.out.printf("Введите символ операции (+ , - , * , / ): ");
        String operation = iScanner.next();

        double res = 0;

        // способ 1
        // switch (operation) {
        //     case "+":
        //         res = sum(a,b);
        //         break;
        //     case "-":
        //         res = sub(a,b);
        //         break;
        //     case "*":
        //         res = mult(a,b);
        //         break;
        //     case "/":
        //         res = divis(a,b);
        //         break;
        // }

        // способ 2
        if (operation.equals("+")) res = sum(a,b); // .equals() сравнивает содержимое ( == проверка равенства как ссылок (две ссылочные переменные должны вести в одно и тоже место))
        if (operation.equals("-")) res = sub(a,b);
        if (operation.equals("*")) res = mult(a,b);
        if (operation.equals("/")) res = divis(a,b);
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" ); // для округления до 2 знаков
        System.out.println(a + " " + operation + " " + b + " = " + decimalFormat.format(res));

       
        iScanner.close();
    }


    static double sum (double a, double b) {
        double result = a + b;
        return result;
    }
    static double sub (double a, double b) {
        double result = a - b;
        return result;
    }
    static double mult (double a, double b) {
        double result = a * b;
        return result;
    }
    static double divis (double a, double b) {
        double result = a / b;
        return result;
    }
}
