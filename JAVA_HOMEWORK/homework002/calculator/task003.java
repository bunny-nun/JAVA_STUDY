/*
К калькулятору из предыдущего дз добавить логирование
 */
package calculator;
import java.io.FileWriter;
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
        System.out.println(calculator.calc(num01, num02, operation));
        logging(calculator.calc(num01, num02, operation));
    }
    public static void logging(String result) {
        try {
            FileWriter file = new FileWriter("calculator/log.txt", true);
            file.write(result);
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
