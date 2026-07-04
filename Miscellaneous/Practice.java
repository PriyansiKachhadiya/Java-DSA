import java.util.*;

public class Practice {

  public static boolean palindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static String ques4(String str) {

    StringBuilder sb = new StringBuilder();

    Character ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }

    }

    return sb.toString();
  }

  public static StringBuilder compress(String str) {

    StringBuilder newStr = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      Integer count = 0;

      while (str.charAt(i) == str.charAt(i++) && i < str.length() - 1) {
        count++;
        i++;
      }
      newStr.append(str.charAt(i));
      if (count > 1) {

        newStr.append(count.toString());

      }

    }
    return newStr;

  }

  public static float getShortestPath(String path) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);
      if (dir == 'S') {
        y--;
      }
      if (dir == 'E') {
        x++;
      }
      if (dir == 'N') {
        y++;
      }
      if (dir == 'W') {
        x--;
      }

    }
    int X = x * x;
    int Y = y * y;

    return (float) Math.sqrt(X + Y);
  }

  public static void staircaseSearch(int matrix[][], int key) {
    int row = matrix.length - 1;
    int col = 0;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        System.out.println("key found at " + row + " " + col);
        return;
      } else if (matrix[row][col] > key) {
        row--;
      } else {
        col++;

      }

      System.out.println("key not found");

    }

  }

  public static boolean search(int matrix[][], int key) {
    int n = matrix.length;
    int m = matrix[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] == key) {
          System.out.println("key found");
          return true;
        }
      }
    }
    System.out.println("key not found");
    return false;
  }

  public static int diagonalSum(int matrix[][]) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {

      sum += matrix[i][i];

      if (i != matrix.length - 1 - i) {
        sum += matrix[i][matrix.length - 1 - i];
      }
    }
    return sum;
  }

  public static void spiral_matrix(int matrix[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length - 1;

    while (startCol <= endCol && startRow <= endRow) {
      // top
      for (int i = startCol; i <= endCol; i++) {
        System.out.print(matrix[startRow][i] + " ");
      }

      // right
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(matrix[endCol][i] + " ");
      }

      // end
      for (int i = endCol - 1; i >= startCol; i--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(matrix[endRow][i]);
      }

      // left
      for (int i = endRow - 1; i >= startRow; i--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(matrix[startRow][i]);
      }

      startRow++;
      endRow--;
      startCol++;
      endCol--;

    }

  }

  public static void ques1(int matrix[][]) {
    int sum = 0;
    for (int i = 0; i < matrix[1].length; i++) {
      sum += matrix[1][i];

    }

    System.out.println(sum);
  }

  public static void ques2(int matrix[][]) {
    int m = matrix.length;
    int n = matrix[0].length;
    int transposematrix[][] = new int[n][m];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        transposematrix[j][i] = matrix[i][j];
      }
    }

    System.out.println("matrix");

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println(matrix[i][j] + " ");
        // Do something with transposematrix[i][j] if needed
      }
      System.out.println();
    }

    System.out.println("transposematrci");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.println(transposematrix[i][j] + " ");
        // Do something with transposematrix[i][j] if needed
      }
      System.out.println();
    }
    // Example return statement, adjust as needed
  }

  public static void ifAnagram(String str1, String str2) {
    if(str1.length() != str2.length()){
      System.out.println("not anagrams they dont even have same lengths");
      return;
    }
    char str3[] = str1.toCharArray();
    char str4[] = str2.toCharArray();
    Arrays.sort(str3);
    Arrays.sort(str4);
    boolean result = Arrays.equals(str3, str4);
    System.out.println(result);
    


  }

  

  public static void main(String args[]) {
    int matrix[][] = new int[3][2];
    int n = matrix.length;
    int m = matrix[0].length;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    // // output
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {

    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();
    // }

    ques2(matrix);
    "abcd".compareTo(null);
    "abcdfe".compareToIgnoreCase("djfdjfjdd");

  }

}
