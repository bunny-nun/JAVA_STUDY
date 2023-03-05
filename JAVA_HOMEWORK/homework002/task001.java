/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации (после перемещения числа) запишите в лог-файл.
 */

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class task001 {
    public static void main(String[] args) {
        int[] array = createArray(10, 0, 10);
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            int temp;
            int count = 0;
            for (int j = 0; j < arraySize - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
            logArray(i + 1, array);
            if (count == 0) break;
        }
    }

    public static int[] createArray(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (max + 1 - min) + min);
        }
        clearFile("/log.txt");
        logArray(0, array);
        return array;
    }

    public static void logArray(int index, int[] array) {
        Logger logfile = Logger.getLogger(task001.class.getName());
        String message = String.format("%d\t%s\n", index, Arrays.toString(array));
        try (FileInputStream file = new FileInputStream("log.properties")) {
            LogManager.getLogManager().readConfiguration(file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            logfile.log(Level.INFO, message);
            System.out.printf(message);
        } catch (Exception ex) {
            logfile.log(Level.WARNING, ex.getMessage());
        }
    }

    public static void clearFile(String fileName) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat(fileName);
        try {
            BufferedWriter writer = Files.newBufferedWriter(Path.of(pathFile), StandardOpenOption.TRUNCATE_EXISTING);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
