/*
Вывести все простые числа от 1 до 1000
 */
public class task002 {
    public static void main(String[] args) {
        int num = 1000;
        for (int i = 2; i <= num; i++) {
            if (isSimple(i)) System.out.printf("%d ", i);
        }
        System.out.println();

    }

    public static boolean isSimple(int number) {
        if (number > 2 && number % 2 == 0) return false;
        for (int i = 3; i < Math.sqrt(number) + 1; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
