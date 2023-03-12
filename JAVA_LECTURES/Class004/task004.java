import java.util.Stack;

/*
Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
 */
public class task004 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        Stack<Integer> myStack = new Stack<>();
        for (int i : myArray) {
            myStack.push(i);
        }
        System.out.println(myStack);
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
