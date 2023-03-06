/*
Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class task003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num01 = Float.parseFloat(input.nextLine().replace(",", "."));
        System.out.print("Введите операцию (+ - / *): ");
        char operation = input.nextLine().charAt(0);
        System.out.print("Введите второе число: ");
        float num02 = Float.parseFloat(input.nextLine().replace(",", "."));
        input.close();
        System.out.println(calc(num01, num02, operation));
    }

    public static String calc(float number01, float number02, char operation) {
        float result = 0;
        StringBuilder resString = new StringBuilder();
        NumberFormat numFormat = new DecimalFormat("#.######");
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
            resString.append(numFormat.format(number01))
                    .append(" ").append(operation).append(" ")
                    .append(numFormat.format(number02))
                    .append(" = ")
                    .append(numFormat.format(result))
                    .append("\n");
        }
        return resString.toString();
    }
}
