// import java.util.*;

public class Matrices {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key noy found");
        return false;
    }

    public static void min_max(int matrix[][]) {
        int min_element = Integer.MAX_VALUE;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min_element) {
                    min_element = matrix[i][j];
                }

                if (matrix[i][j] > max_element) {
                    max_element = matrix[i][j];
                }

            }

        }
        System.out.println("min element is" + min_element);
        System.out.println("max element is " + max_element);
    }

    public static void spiral_matrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

    }

    public static int diagonalSum(int matrix[][]) {
        // o(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd -- primary diagonal
            sum += matrix[i][i];
            // sd --secondary diagonal
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - i - 1];
        }
        // brute - force approch --- O(n^2)
        // for(int i=0;i<matrix.length;i++){
        // for(int j = 0;j<matrix[0].length;j++){
        // if(i == j){
        // sum+= matrix[i][j];
        // }
        // else if(i+j == matrix.length-1){
        // sum += matrix[i][j];
        // }
        // }
        // }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        // time complexity = O(n+m) n== row and m == col
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }

        }
        System.out.println("key not found!");
        return false;
    }

    public static boolean staircaseSearchHomework(int matrix[][], int key) {
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("found key at " + row + " and  " + col);
                return true;
            } else if (key > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("key not found");
        return false;

    }

    public static void ques_1(int matrix[][], int key) {
        int sum = 0; // To count occurrences of the key
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    sum++;
                }
            }
        }
        System.out.println("Number of occurrences of " + key + " in matrix is: " + sum);
    }
    public static void ques2(int matrix[][]){
        int sum = 0;
        for(int i = 0;i<matrix[1].length;i++){
            sum += matrix[1][i];
        }
        System.out.println(sum);
    }
    public static void ques3(int matrix[][]){
        int row = matrix.length,  col= matrix[0].length;
      int transpose [][] = new int [col][row];
      for(int i =0 ;i<row;i++){
        for(int j =0;j<col;j++){
            transpose[j][i] = matrix[i][j];
        }
      }

    //   print matrix and transpose
    for(int i = 0;i<transpose.length;i++){
        for(int j =0;j<transpose[0].length;j++){
            System.out.print(transpose[i][j] + ", ");
        }
        System.out.println();;
    }
    }

    public static void main(String args[]) {
        // int matrix[][] = {{ 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 27, 29, 37, 48 },
        // { 32, 33, 39, 50 }
        // };
        // int key = 33;
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
       

        // staircaseSearch(matrix, key);
        // staircaseSearchHomework(matrix, key);
        // ques_1(array, key);
        // ques2(array);
        ques3(array);
        // spiral_matrix(matrix);
        // System.out.println(diagonalSum(matrix));
        // int matrix[][] = new int[3][3];
        // int n = matrix.length;
        // int m = matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        // for(int i =0;i<n;i++){
        // for(int j = 0;j<m;j++){
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // // output
        // for(int i =0;i<n;i++){
        // for(int j = 0;j<m;j++){
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        // min_max(matrix);

    }
}
