/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcaaadd.
результат - a4b3ca3d2
 */
public class task002 {
    public static void main(String[] args) {
        String myString = "aaaabbbcaaadd";
        StringBuilder resString = new StringBuilder();
        int count = 1;
        for (int i = 0; i < myString.length() - 1; i++) {
            if (myString.charAt(i + 1) == myString.charAt(i)) {
                count++;
            } else {
                resString.append(myString.charAt(i));
                if (count > 1) resString.append(count);
                count = 1;
            }
        }
        resString.append(myString.charAt(myString.length() - 1));
        if (count > 1) resString.append(count);
        System.out.println(resString);
    }
}
