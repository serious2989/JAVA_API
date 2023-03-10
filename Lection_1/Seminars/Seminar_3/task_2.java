// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
// Sun
// Mercury
// Venus
// Earth
// Mars
// Jupiter
// Saturn
// Uranus
// Neptune
// Pluto

package Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(
                Arrays.asList("Pluton", "Pluton", "Pluton", "Neptune", "Uranus", "Saturn",
                        "Jupiter", "Mercury", "Sun", "Earth", "Mars", "Mars"));
        int count = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            count = 0;
            if (!result.contains(arr.get(i)))
                ;
            {
                result.add(arr.get(i));
                for (int j = 0; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {

                        count += 1;
                    }
                }

            }
            System.out.println(count  + arr.get(i));
        }
    }
}
