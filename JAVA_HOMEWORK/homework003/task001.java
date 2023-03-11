/*
Реализовать алгоритм сортировки слиянием
 */

import java.util.ArrayList;
import java.util.Random;

public class task001 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            myList.add(new Random().nextInt(0, 100));
        }
        System.out.println(myList);
        System.out.println(mergeSort(myList));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> myList) {
        if (myList.size() <= 1) return myList;
        int middle = myList.size() / 2;
        ArrayList<Integer> leftList = mergeSort(new ArrayList<>(myList.subList(0, middle)));
        ArrayList<Integer> rightList = mergeSort(new ArrayList<>(myList.subList(middle, myList.size())));
        ArrayList<Integer> resList = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
            if (leftList.get(leftIndex) < rightList.get(rightIndex)) {
                resList.add(leftList.get(leftIndex));
                leftIndex++;
            } else {
                resList.add(rightList.get(rightIndex));
                rightIndex++;
            }
        }
        while (leftIndex < leftList.size()) {
            resList.add(leftList.get(leftIndex));
            leftIndex++;
        }
        while (rightIndex < rightList.size()) {
            resList.add(rightList.get(rightIndex));
            rightIndex++;
        }
        return resList;
    }
}
