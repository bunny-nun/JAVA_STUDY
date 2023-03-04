/*
Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */

import java.util.Scanner;

public class task003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num01 = input.nextDouble();
        System.out.print("Введите операцию (+ - / *): ");
        char operation = input.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num02 = input.nextDouble();
        input.close();
        calc(num01, num02, operation);
    }

    public static void calc(double number01, double number02, char operation) {

        double result = 0;
        if (operation == '+') {
            result = number01 + number02;
        } else if (operation == '-') {
            result = number01 - number02;
        } else if (operation == '*') {
            result = number01 * number02;
        } else if (operation == '/') {
            result = number01 / number02;
        } else {
            System.out.println("Вы ввели недоступную операцию");
        }
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
            if (number01 % 1 == 0) {
                int inumber01 = (int) number01;
                System.out.print(inumber01);
            } else {
                System.out.printf("%.2f", number01);
            }
            System.out.printf(" %s ", operation);
            if (number02 % 1 == 0) {
                int inumber02 = (int) number02;
                System.out.printf("%d = ", inumber02);
            } else {
                System.out.printf("%.2f = ", number02);
            }
            if (result % 1 == 0) {
                int iresult = (int) result;
                System.out.println(iresult);
            } else {
                System.out.printf("%.2f\n", result);
            }
        }
    }
}
