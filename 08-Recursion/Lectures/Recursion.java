public class Recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n);
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;

        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumOf1ToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOf1ToN(n - 1);
    }

    public static int fibonnaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

    public static boolean isSorted(int arr[], int i) {
        // base case timecomplexity is big oh of n
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOcurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcurence(arr, key, i + 1);
    }

    public static int lastOcurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int pow(int x, int n) {
        // tc -- big oh of n
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);

    }

    // optimized way of calculate power with big oh of logn timecomplexity
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowsq = halfPower * halfPower;
        if (n % 2 != 0) {

            return (a * halfPowsq);
        }
        return halfPowsq;
    }

    // tiling problem-- question asked by amazon
    // set tile size of (2 X 1) in (2 X n) size floor -- find number of ways we can
    // set tile in tile floor
    public static int tilingProblem(int n) { // 2X n floor size
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // if we take vertical choice
        int fnm1 = tilingProblem(n - 1); // fnm1 means f n minus 1 function with n-1

        // horizontal choise
        int fnm2 = tilingProblem(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }
    // remove duplicates in a string --asked by google annd microsoft

    public static void removeDuplicates(String str, int idx, StringBuilder newString, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // dublicate
            removeDuplicates(str, idx + 1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString.append(currChar), map);
        }
    }

    // friends pairning probem by goldman sachs

    public static int friendsPairing(int n) {
        // choice
        // single
        int fnm1 = friendsPairing(n - 1);

        // pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        int totWays = fnm1 + pairWays;
        return totWays;

        // insted of this whole code
        // if (n==1 || n==2){return n}
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void printBinaryStrings(int n, int lastPlace, String str) {
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
       //kaam 
    //    if(lastPlace == 0){
    //     // sit 0 on nth place
    //     printBinaryStrings(n-1, 0, str.append('0'));
    //     printBinaryStrings(n-1, 1, str.append("1"));
    //    }else{
    //     printBinaryStrings(n-1, 0, str.append('0'));
    //    }
        printBinaryStrings(n-1, 0, str+"0"); 
        if(lastPlace == 0){
            printBinaryStrings(n-1, 1, str+"1");
        }


    }

    public static void main(String args[]) {
        // printDec(8);
        // printInc(9);

        // System.out.println(factorial(5));
        // System.out.println(sumOf1ToN(5));
        // System.out.println(fibonnaci(5));
        // int arr[] = { 1, 4, 3, 2, 3, 4, 5, 6, 3 };
        // System.out.println(isSorted(arr,0));
        // System.out.println(firstOcurence(arr, 5, 0));
        // System.out.println(lastOcurence(arr, 3, 0));
        // System.out.println(pow(2, 10));
        // String str = "apna college";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        printBinaryStrings(4, 0, "");

    }
}
