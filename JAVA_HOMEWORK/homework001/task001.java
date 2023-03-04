/*
Вычислить n-ое треугольное число (сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
 */

import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int num = input.nextInt();
        input.close();
        if (num < 1) {
            System.out.println("Введено число меньше 1");
        } else {
            System.out.printf("Треугольное число n = %d\n", triangular(num));
            System.out.printf("n! = %d\n", factorial(num));
            System.out.printf("Треугольное число n (циклом) = %d\n", triangular01(num));
            System.out.printf("n! (циклом) = %d\n", factorial01(num));
        }
    }

    public static int triangular(int number) {
        if (number == 1) return 1;
        else return number + triangular(number - 1);
    }

    public static int factorial(int number) {
        if (number == 1) return 1;
        else return number * factorial(number - 1);
    }

    public static int triangular01(int number) {
        int res = 0;
        for (int i = 1; i <= number; i++) {
            res += i;
        }
        return res;
    }

    public static int factorial01(int number) {
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res *= i;
        }
        return res;
    }
}
