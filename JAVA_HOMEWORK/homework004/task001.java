import java.util.Arrays;
import java.util.LinkedList;

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
 */
public class task001 {
    public static void main(String[] args) {
        LinkedList<Object> myList = new LinkedList<>(Arrays.asList("hello", "world", 25, 25.01, "word"));
        System.out.println(myList);
        System.out.println(reverseList(myList));
    }

    public static Object reverseList (LinkedList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(list.size() - i, list.get(0));
            list.remove();
        }
        return list;
    }
}
