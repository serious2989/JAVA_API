// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

package Seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task_1_1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(10);
            ar.add(x);
        }
        System.out.println(ar.toString());
        ar.sort(Comparator.naturalOrder());
        System.out.println(ar.toString());
    }

}