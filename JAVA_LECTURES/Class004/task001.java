import java.util.ArrayList;
import java.util.LinkedList;

/*
1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.
System.currentTimeMillis();
 */
public class task001 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long timeStartArray = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        long timeStopArray = System.currentTimeMillis();
        System.out.println(timeStopArray - timeStartArray);
        long timeStartLinked = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        long timeStopLinked = System.currentTimeMillis();
        System.out.println(timeStopLinked - timeStartLinked);
    }
}
