package Seminar_1;
// Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1,1,1,1,1], 
// вывести максимальное количество подряд идущих 1.



// package Seminar_1;

// /**
//  * task_2
//  */
// public class task_2 {

//     public static void main(String[] args) {
//         int[] arr = new int[] {1,1,0,1,1,1,0,1,1,1,1,1};
//         int n = 0;
//         int max = 0;
//         for (int index = 0; index < arr.length; ++index) 
//         {
//             if (arr[index] == 1);
//             {
//                 n++;
//                 if (max < n && index == arr.length - 1);
//             }
//             else if(max < n || index == arr.length - 1)
//             {
//                 max = n;
//                 n = 0;
//             }
//         } 
//         System.out.println();
//     }
// }

public class task_2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,0,1,1,1};
        int n = 0;
        int max = 0;
        for (int i = 0; i < array.length; ++i)
        {
            if (array[i] == 1)
            {
                n++;
            }
            else if (max < n)
            {
                max = n;
                n = 0;
            }
        }
        if (max < n)
            {
                max = n;
                n = 0;
            }
        System.out.println(max);
}
}