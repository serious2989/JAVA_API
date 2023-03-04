// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”


package Seminar_1;

import java.util.Scanner;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        System.out.println("Enter your name ");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        String name = iScanner.nextLine();
        System.out.printf("Привет! %s ", name);
    }
}

// public class Sem_1 {
//     public static void main(String[] args) {
//         System.out.println("Введите свое имя: ");
//         Scanner iScanner = new Scanner(System.in, "Cp866");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет! %s ", name);
//     }
// }