// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом 
// (возвращает boolean значение).

package seminar_2;

import java.util.Scanner;

public class task_3 {

    public static boolean name(String N) {
        for (int i = 0; i < N.length()/2; i++) {
            if (N.charAt(i) != N.charAt(N.length()-i-1))
                return false;
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        String N = iScanner.nextLine();
        System.out.println(name(N));
        iScanner.close();
    }   
    }

