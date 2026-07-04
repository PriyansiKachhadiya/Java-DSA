public class BackTracking {
    public static void changeArr(int arr[], int i, int val) {
        // time complexity O(n)
        // coz we call function 2n times not n^2 times first we go to n=0 to n=5 coz of
        // recursion call and
        // n=5 to n=0 coz of backtracking step
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion (kaam)
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // fnx call step
        arr[i] = arr[i] - 2; // backtracking step
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = new int[5];

        changeArr(arr, 0, 1);
        printArr(arr);

    }
}
