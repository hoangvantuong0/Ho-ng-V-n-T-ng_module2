package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMinimaxElementInTwoDimensionalArray {
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of row in array");
        m = input.nextInt();
        System.out.println("Enter number of column in array");
        n = input.nextInt();
        int array[][] = new int[m][n];
        System.out.println("Enter value for elements");
        for (int i = 0; i < m; i++){
            for (int j = 0; j <n; j++){
                System.out.print("array [" + i + "][" + j + "] = ");
                array[i][j] = input.nextInt();
            }
        }
        int min = array[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                if(min > array[i][j]){
                    min = array[i][j];
                    indexRow = i;
                    indexCol = j;

                }
            }
        }
        System.out.print("The min value element in the array is: " + min + " at position indexRow: " + indexRow + " indexCol: "+ indexCol);
    }
}
