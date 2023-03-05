package calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num01 = input.nextDouble();
        System.out.print("Введите операцию (+ - / *): ");
        char operation = input.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num02 = input.nextDouble();
        input.close();
        System.out.println(calc(num01, num02, operation));
    }
    public static String calc(double number01, double number02, char operation) {
        double result = 0;
        StringBuilder resString = new StringBuilder();
        String format;
        if (operation == '+') {
            result = number01 + number02;
        } else if (operation == '-') {
            result = number01 - number02;
        } else if (operation == '*') {
            result = number01 * number02;
        } else if (operation == '/') {
            result = number01 / number02;
        } else {
            resString.append("Операция недоступна\n");
        }
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
            if (number01 % 1 == 0) {
                resString.append((int) number01);
            } else {
                format = String.format("%.2f", number01);
                resString.append(format);
            }
            resString.append(" ")
                    .append(operation)
                    .append(" ");
            if (number02 % 1 == 0) {
                resString.append((int) number02);
            } else {
                format = String.format("%.2f", number02);
                resString.append(format);
            }
            resString.append(" = ");
            if (result % 1 == 0) {
                resString.append((int) result);
            } else {
                format = String.format("%.2f", result);
                resString.append(format);
            }
            resString.append("\n");
        }
    return resString.toString();
    }
}