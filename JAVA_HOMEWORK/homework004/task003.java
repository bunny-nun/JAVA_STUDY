/*
В калькулятор добавьте возможность отменить последнюю операцию.
Пример:
1
+
2
ответ: 3

+
4
ответ:
7

Отмена
ответ:
3

*
3
ответ:
9

 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Stack;

public class task003 {
    public static void main(String[] args) {
        Stack<Float> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();
        Stack<Float> logger = new Stack<>();
        Scanner input = new Scanner(System.in);
        float num = 0.1f;
        while (num == 0.1f) {
            try {
                System.out.print("Введите число: ");
                num = Float.parseFloat(input.nextLine().replace(",", "."));
            } catch (Exception ex) {
                System.out.print("Некорректный формат данных. ");
            }
        }
        numbers.push(num);
        while (true) {
            System.out.print("Введите операцию (+, -, /, *, для отмены - cancel, для выхода - stop): ");
            String text = input.nextLine();
            char operation;
            if (text.contains("stop")) {
                break;
            } else if (text.contains("cancel")) {
                if (!logger.isEmpty()) {
                    operation = operations.pop();
                    System.out.println(cancel(operation, logger, numbers));
                } else {
                    numbers.push(Float.parseFloat("0"));
                    System.out.println(calc(numbers, '*'));
                }
            } else {
                operation = text.charAt(0);
                operations.push(operation);
                num = 0.1f;
                while (num == 0.1f) {
                    try {
                        System.out.print("Введите число: ");
                        num = Float.parseFloat(input.nextLine().replace(",", "."));
                        if (operation == '/' && num == 0) {
                            System.out.print("На ноль делить нельзя. ");
                            num = 0.1f;
                        }
                    } catch (Exception ex) {
                        System.out.println("Некорректный формат данных. ");
                    }
                }
                numbers.push(num);
                logger.push(num);
                System.out.println(calc(numbers, operation));
            }
        }
        input.close();
    }

    public static String calc(Stack<Float> numbers, char operation) {
        float result;
        NumberFormat numFormat = new DecimalFormat("#.######");
        switch (operation) {
            case '+' -> result = numbers.pop() + numbers.pop();
            case '-' -> result = -numbers.pop() + numbers.pop();
            case '*' -> result = numbers.pop() * numbers.pop();
            case '/' -> {
                float variable = numbers.pop();
                result = numbers.pop() / variable;
            }
            default -> {
                numbers.pop();
                System.out.println("Недопустимая операция.");
                result = numbers.pop();
            }
        }
        numbers.push(result);
        return numFormat.format(result);
    }

    public static String cancel(char operation, Stack<Float> logger, Stack<Float> numbers) {
        numbers.push(logger.pop());
        switch (operation) {
            case '+' -> operation = '-';
            case '-' -> operation = '+';
            case '*' -> operation = '/';
            case '/' -> operation = '*';
            default -> {
            }
        }
        return calc(numbers, operation);
    }
}
