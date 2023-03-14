// Вывести все простые числа от 1 до 1000

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package Lection_1.Homeworks_JAVA.DZ_1;

import java.io.IOException;
import java.lang.System.Logger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class task_3_dz {
     // метод получения числа
     static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
        // scan.close(); Почему не получается закрыть Scanner???
    }

    // метод получения числа операции
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    // метод получения результата
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

    // /**
    //  * @param arr
    //  * @return
    //  * @throws IOException
    //  */
    // public static int[] calclogger(int arr[]) throws IOException {
    //     Logger loger = Logger.getLogger(task_3_dz.class.getName());
    //     FileHandler fHandler = new FileHandler("CalcLog.txt");
    //     SimpleFormatter sFormatter = new SimpleFormatter();
    //     fHandler.setFormatter(sFormatter);
    //     loger.addHandler(fHandler);

    //     int temp;
    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         for (int j = 0; j < arr.length - 1; j++) {
    //             if (arr[j] < arr[j + 1]) {
    //                 temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }

    //         ((Object) loger).info(Arrays.toString(arr));
    //     }
    //     return arr;
}
