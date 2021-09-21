package _14_sorting_algorithms.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] array) {
        int pos, x, i;
        for (i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;

            while (0 < pos && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("inner: " + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));

            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }
}