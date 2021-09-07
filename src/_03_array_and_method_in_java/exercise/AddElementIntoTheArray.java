package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementIntoTheArray {
    public static void main(String[] args) {
            int[] arr = new int[100];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input len: ");
            int len = scanner.nextInt();
            System.out.println("Input element: ");
            for (int i = 0; i < len; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Input position: ");
            int pos = scanner.nextInt();
            System.out.println("Input value: ");
            int value = scanner.nextInt();
            for (int j = arr.length-1; j > pos; j--) {
                arr[j] = arr[j - 1];
            }
            len++;

            arr[pos] = value;

            int[] b = Arrays.copyOf(arr, len);
            System.out.println(Arrays.toString(b));
        }
    }

