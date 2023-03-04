/*
Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
Ввод:  2? + ?5 = 69
Вывод: 24 + 45 = 69
 */

import java.util.Scanner;

public class task004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите уравнение вида q + w = e (q, w, e - положительные двузначные числа): ");
        String equation = input.nextLine();
        input.close();
        equation = equation.replace(" ", "");
        int number = 10;
        int result = Integer.parseInt(equation.substring(6));
        String[] array = equation.split("");
        int[] numArray = new int[5];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numArray.length; j++) {
                try {
                    numArray[j] = Integer.parseInt(array[j]);
                } catch (NumberFormatException e) {
                    numArray[j] = i;
                }
            }
            if ((numArray[0] * 10 + numArray[1]) + (numArray[3] * 10 + numArray[4]) == result) {
                number = i;
                break;
            }
        }
        if (number < 10) {
            System.out.printf("%d%d + %d%d = %d\n", numArray[0], numArray[1], numArray[3], numArray[4], result);
        } else {
            System.out.println("Решений нет");
        }
    }
}