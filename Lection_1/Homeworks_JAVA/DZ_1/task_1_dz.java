// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! 
// (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120


package Lection_1.Homeworks_JAVA.DZ_1;
import java.util.Scanner;

/**
 * task_1_dz
 */
public class task_1_dz {
     
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число(5): ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: 1 + 2 + 3 + 4 + 5 = %d\n", giveMeNumber(i));
        iScanner.close();
        System.out.printf("произведение чисел от 1 до n: 1 * 2 * 3 * 4 * 5 = %d\n", giveMeNumber1(i));
        iScanner.close();
    }

    

    public static int giveMeNumber(int n) {
        return (1 + 2 + 3 + 4 + 5);
    }
    public static int giveMeNumber1(int n) {
        return (1 * 2 * 3 * 4 * 5);
    }
    
}
        
    