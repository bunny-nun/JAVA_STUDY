/* Написать программу, которая запросит пользователя ввести <Имя> в консоли. Получит введенную строку и выведет
в консоль сообщение “Привет, <Имя>!”
 */

import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        String inputName = input.nextLine();
        System.out.printf("Привет, %s!\n", inputName);
        input.close();
    }
}

