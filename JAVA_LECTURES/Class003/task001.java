/*
Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
 */

import java.util.ArrayList;
import java.util.Comparator;

public class task001 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 10));
        }
        System.out.println(myList);
        myList.sort(Comparator.naturalOrder());
        System.out.println(myList);
    }
}
