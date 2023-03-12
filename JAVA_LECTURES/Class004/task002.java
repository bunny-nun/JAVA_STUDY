import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида text
Нужно сохранить text в связный список.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class task002 {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter value: ");
            String text = input.nextLine();
            if (text.contains("print~")) {
                try {
                    int num = Integer.parseInt(text.split("~")[1]);
                    System.out.println(myList.get(num));
                    myList.remove(num);
                    System.out.println(myList);
                } catch (Exception ex) {
                    System.out.println("Wrong index");
                }
            } else if (text.equals("print")) {
                System.out.println(myList);
            } else if (text.equals("stop")) {
                break;
            } else {
                myList.add(text);
                System.out.println(myList);
            }
        }
        input.close();
    }
}
