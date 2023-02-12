// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

class Task_001 {
    public static void main(String[] args) {
        System.out.printf("Введите число n для вычисления треугольного числа и факториала числа n: ");
        Scanner iScanner = new Scanner(System.in, "cp866"); // "cp866" - кодировка позволяет принимать кириллицу, без этого аркумента можно написать имя только латинскими буквами
        int n = iScanner.nextInt();
        System.out.print(String.format("%d-ое треугольное число => ", n));
        System.out.println(triangle(n));
        System.out.print(String.format("Факториал числа %d => ", n));
        System.out.println(factorial(n));
        
        iScanner.close();
    }

    static int triangle (int n) {
        int result = n*(n+1)/2;
        return result;
    } 

    static int factorial (int n) {
        if(n==1)return 1;
        return n * factorial(n-1);
    }
}