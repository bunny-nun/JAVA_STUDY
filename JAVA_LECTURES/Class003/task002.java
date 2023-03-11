import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */
public class task002 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Венера", "Земля", "Марс", "Юпитер", "Марс"));
        for (int i = planets.size() - 1; i >= 0; i--) {
            System.out.printf("%s %d\n", planets.get(i), Collections.frequency(planets, planets.get(i)));
        }
    }
}

//        planets.sort(Comparator.naturalOrder());
//        System.out.println(planets);
//        int count = 1;
//        String planet = planets.get(0);
//        for (int i = 1; i < planets.size(); i++) {
//            if (planets.get(i).equals(planet)) {
//                count++;
//            } else {
//                System.out.printf("%s %s\n", planet, count);
//                count = 1;
//                planet = planets.get(i);
//            }
//        }
//        System.out.printf("%s %s\n", planets.get(planets.size() - 1), count);
//    }
//}
