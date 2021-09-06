package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length + arr2.length];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        while (i < arr1.length) {
            System.out.print("Enter value for element " + (i + 1) + " in arr1: ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        while (j < arr2.length) {
            System.out.print("Enter value for element " + (j + 1) + " in arr2: ");
            arr2[j] = scanner.nextInt();
            j++;
        }
        for (i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Array 3: ");
        for (int a : arr3) {
            System.out.print(a + "\t");
        }
    }
}
