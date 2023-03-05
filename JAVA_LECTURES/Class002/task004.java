/*
Записать в простой текстовый файл слово TEST 10 раз, обработайте исключения.
 */

import java.io.FileWriter;

public class task004 {
    public static void main(String[] args) {
        String line = "TEST";
        int num = 10;
        try {
            FileWriter file = new FileWriter("test.txt", false);
            for (int i = 0; i < num; i++) {
                file.write(Integer.toString(i + 1));
                file.append(".\s");
                file.append(line);
                file.append("\n");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
