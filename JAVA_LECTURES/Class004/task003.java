import java.util.Scanner;
import java.util.Stack;

/* Реализовать консольное приложение, которое:

1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Остановка на stop
 */
public class task003 {
    public static void main(String[] args) {
        Stack<String> myList = new Stack<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter value: ");
            String text = input.nextLine();
            if (text.equals("print")) {
                while (!myList.isEmpty()) {
                    System.out.println(myList.pop());
                }
            } else if (text.equals("stop")) {
                break;
            } else {
                myList.push(text);
                System.out.println(myList);
            }
        }
        input.close();
    }
}
