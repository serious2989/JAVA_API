// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида

// text

// 1. Нужно сохранить text в связный список
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

// asd
// [asd]
// dfhj
// [asd, dfhj]
// xzcv
// [asd, dfhj, xzcv]
// print~1
// Вывод dfhj
// [asd, xzcv]

package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList<String> listlink = new LinkedList<>();
        System.out.println("Enter string: ");
        String str = scn.nextLine();
        while (!scn.equals("stop")) {
            if (!str.contains("print~")) {
                listlink.add(str);
            } else {
                String st = str.substring(6);
                System.out.println(st);
                int index = Integer.parseInt(st);
                System.out.println(listlink.get(index));
                listlink.remove(index);
            }
            System.out.print(listlink.toString());
            System.out.println("Enter new string: ");
            str = scn.nextLine();
            
        }
            scn.close();
    }
}


// public static void main(String[] args) {
//     long timeStart_1 = System.currentTimeMillis();
//     ArrayList<Integer> resultList = new ArrayList<>();
//     for (int i = 0; i < 100000; i++) {
//         resultList.add(0, i);
//     }
//     long timeFinish_1 = System.currentTimeMillis();

//     long timeStart_2 = System.currentTimeMillis();
//     LinkedList<Integer> listLink = new LinkedList<>();
//     for (int i = 0; i < 1000000; i++) {
//         listLink.add(0, i);
//     }
//     long timeFinish_2 = System.currentTimeMillis();
//     System.out.printf("The time_1 = %d \n", timeFinish_1 - timeStart_1);
//     System.out.printf("The time_2 = %d \n", timeFinish_2 - timeStart_2);
// }
// }import java.util.ArrayList;
// import java.util.LinkedList;

// public class Task_01 {
// public static void main(String[] args) {
//     long timeStart_1 = System.currentTimeMillis();
//     ArrayList<Integer> resultList = new ArrayList<>();
//     for (int i = 0; i < 100000; i++) {
//         resultList.add(0, i);
//     }
//     long timeFinish_1 = System.currentTimeMillis();

//     long timeStart_2 = System.currentTimeMillis();
//     LinkedList<Integer> listLink = new LinkedList<>();
//     for (int i = 0; i < 1000000; i++) {import java.util.LinkedList;
// import java.util.Scanner;

// import javax.sql.rowset.serial.SQLOutputImpl;

// public class Task_02 {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     LinkedList<String> listLink = new LinkedList<>();
//     System.out.println("Enter string: ");
//     String str = scn.nextLine();
//     while (!str.equals("stop")) {
//         if (!str.contains("print~")) {
//             listLink.add(str);
//         } else {
//             String st = str.substring(6);
//             System.out.println(st);
//             int index = Integer.parseInt(st);
//             System.out.println(listLink.get(index));
//             listLink.remove(index);
//         }
//         System.out.print(listLink.toString());
//         System.out.println("Enter new string: ");
//         str = scn.nextLine();
//     }
//     scn.close();
// }
// }
//         listLink.add(0, i);
//     }
//     long timeFinish_2 = System.currentTimeMillis();
//     System.out.printf("The time_1 = %d \n", timeFinish_1 - timeStart_1);
//     System.out.printf("The time_2 = %d \n", timeFinish_2 - timeStart_2);
//     System.out.println(timeFinish_2);
// }
// }