import java.util.ArrayList;
import java.util.Arrays;


/*
Создать список типа ArrayList.
Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа
 */
public class task003 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList<>(Arrays.asList(1, "9", "text", 5, 5, "another text", 25, 23.25));
        for (int i = myList.size() - 1; i >= 0 ; i--) {
            if (myList.get(i) instanceof Integer) {
                myList.remove(myList.get(i));
            }
        }
        System.out.println(myList);
    }
}
