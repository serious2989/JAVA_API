package Lection_1.Homeworks_JAVA;

import java.util.Scanner;

public class task_4_dz_dop {
    public static void main(String[] args) {

        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.print("Enter equation like '2? + ?5 = 69': ");
            String equation = iScanner.nextLine(); //2? + ?5 = 69.
            String message = "Решения нет!";
            for (int i = 0; i < 10; i++) {
                String result = equation.replace("?", Integer.toString(i));
                // 20 + 05 = 69  
                String[] arr = result.split(" ");
                if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]))
                    message = result;
            }
            System.out.println(message);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}