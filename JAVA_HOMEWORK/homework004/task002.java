/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class task002 {
    public static void main(String[] args) {
        LinkedList<Object> myList = new LinkedList<>(Arrays.asList("hello", "world", 25, 25.01, "word"));
        System.out.println(myList);
        System.out.println();

        System.out.println("enqueue:");
        System.out.println(enqueue(myList, 50));
        System.out.println(myList);
        System.out.println();

        System.out.println("dequeue:");
        System.out.println(dequeue(myList));
        System.out.println(myList);
        System.out.println();

        System.out.println("first:");
        System.out.println(first(myList));
        System.out.println(myList);
    }

    public static Object enqueue(LinkedList<Object> list, Object element) {
        // помещает новый элемент в конец очереди
        return list.offer(element);
    }

    public static Object dequeue(LinkedList<Object> list) {
        // возвращает первый элемент из очереди и удаляет его
        return list.poll();
    }

    public static Object first(LinkedList<Object> list) {
        // возвращает первый элемент из очереди, не удаляя
        return list.peek();
    }
}
