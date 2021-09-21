package _14_sorting_algorithms.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Enter: " + list.length + " value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("List before sort: " + Arrays.toString(list));
        insertionSort(list);
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;

            while (0 < pos && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("inner: " + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
    }
}

























