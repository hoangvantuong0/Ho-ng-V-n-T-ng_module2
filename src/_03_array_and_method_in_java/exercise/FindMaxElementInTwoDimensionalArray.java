package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMaxElementInTwoDimensionalArray {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of row: ");
        m = scanner.nextInt();
        System.out.println("Input number of column: ");
        n = scanner.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Input value for elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");

                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("The max value element in the array is: " + max + " at position indexRow: " + indexRow + " indexCol: "+ indexCol);
    }
}