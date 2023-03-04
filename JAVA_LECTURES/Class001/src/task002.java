/*
Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1,1,1,1,1],
вывести максимальное количество подряд идущих 1
*/


public class task002 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            }
            else {
                max_count = Math.max(count, max_count);
                count = 0;
            }
        }
        max_count = Math.max(count, max_count);
        System.out.printf("Максимальное количество подряд идущих единиц = %d\n", max_count);
    }
}
