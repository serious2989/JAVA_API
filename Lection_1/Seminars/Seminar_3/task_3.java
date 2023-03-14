// Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
//  Пройти по списку, найти и удалить целые числа.

package Seminar_3;

import java.util.*;

public class task_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        list1.add("asdad5");
        list1.add("asdad4");
        list1.add("asdad3");
        list1.add(22);
        list1.add(22);
        list1.add(22);
        list1.add("asdad2");
        list1.add("asdad1");
        list1.add(22);

        System.out.println(list1);
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (list1.get(i) instanceof Integer) {
                list1.remove(i);

            }
        }
        System.out.println(list1);
    }
}
