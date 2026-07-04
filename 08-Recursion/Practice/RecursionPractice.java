public class RecursionPractice {
  static String numberName[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

  // question 1
  public static void ques1(int arr[], int key, int index) {

    if (index == arr.length) {
      return;
    }

    if (arr[index] == key) {
      System.out.print(index + " ");
    }
    ques1(arr, key, index + 1);
  }

  public static void ques2(int n, int i) {

    // String str = Integer.toString(n);
    String str = String.valueOf(n);

    // base case
    if (i == str.length()) {
      return;
    }

    System.out.print(numberName[str.charAt(i) - '0'] + " ");
    ques2(n, i + 1);

  }

  public static int ques3(String str) {
    if (str.length() == 0) {
      return 0;
    }
    return ques3(str.substring(1)) + 1;

  }

  public static int ques4(String str, int si, int ei) {

    // for(int i = 0;i<str.length();i++){
    // for(int j = i+1;j<=str.length();j++){
    // System.out.println(str.substring(i, j));
    // }
    // }
    // base case
    if (si > ei) {
      return 0;
    }

    int firstCharRemoved = ques4(str, si + 1, ei);
    int lastCharRemoved = ques4(str, si, ei - 1);
    int firstLastCharRemoved = ques4(str, si + 1, ei - 1);

    int ans = firstCharRemoved + lastCharRemoved - firstLastCharRemoved;

    if (str.charAt(si) == str.charAt(ei)) {
      ans++;
    }

    return ans;

  }

  // tower of hanoi
  public static void toh(int n, String src, String helper, String dest) {
    // move n disks from src to dest using helper
    if (n == 1) {
      System.out.println("transfer disk " + n + " from " + src + " to " + dest);
      return;
    }

    toh(n - 1, src, dest, helper); // transfer top n-1 disk from src to helper using dest as a helper
    System.out.println("transfer disk " + n + "  from " + src +
        " to " + dest);
    toh(n - 1, helper, src, dest); //transfer n-1 disks from helper to dest using src as helper
  }
 
  public static void main(String args[]) {
    int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
    // ques1(arr, 2, 0);
    // ques2(234175, 0);
    // String str = "abcab";
    // int n = str.length() - 1;
    // System.out.println(ques4(str, 0, n));
    toh(3, "A", "B", "C");

  }
}
