import java.util.*;

// public class Practice2 {

//     static void reverseArr(int arr[]) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start < end) {
//             int temp = arr[start];

//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }

//     }

//     static void printPairs(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 System.out.println("(" + arr[i] + " , " + arr[j] + ")");
//             }
//         }
//     }

//     static void printSubarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {

//             for (int j = i; j < arr.length; j++) {

//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k]);
//                     if (k < j)
//                         System.out.print(", ");
//                 }
//                 System.out.println();

//             }

//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int marks[] = { 1, 4, 2, 10, 5, 8 };
//         printSubarr(marks);

//         sc.close();

//     }
// }

public class Practice2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int pen = 8;
        int pencil = 10;
        int eraser = 2;
        int pencilEntity = sc.nextInt();
        int penEntity =sc.nextInt();
        int eraseerEntity = sc.nextInt();
        int sum = (pen * pencilEntity) + (pencil * pencilEntity) + (eraser * eraseerEntity);
        double total = sum +  sum * 0.18;
        System.out.println(total);
    

    }
}
