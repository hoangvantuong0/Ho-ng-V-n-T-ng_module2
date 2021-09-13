package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddAnElementIntoTheArray {
//    public static void main(String[] args) {
//        int[]arr = {1,2,3,4,5,6,0,0,0,0};
//        int atIndex = 8;
//        int value = 9;
//        System.out.println("The array before add an element: ");
//        for (int element : arr) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        for (int j = arr.length-1; j > atIndex; j--) {
//            arr[j] = arr[j - 1];
//        }
//        arr[atIndex] = value;
//        System.out.println("array after add an element");
//        for (int element : arr) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//    }
//}
//package test;
//        import java.util.Arrays;
//import java.util.Scanner;
//    public class DemoArray02 {
        public static void main(String[] args) {
//             C1: dung 1 mang
        int[] arr = new int[100];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input len: "); // 4
        int len = scanner.nextInt();

        System.out.println("Input element: "); // 9 8 7 6
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
//
        System.out.println("Input pos: "); // 2
        int pos = scanner.nextInt();
            System.out.println("Input value: "); // 2
            int value = scanner.nextInt();

//        for (int i = pos; i < len; i++) {
//            a[i] = a[i + 1];
//        }
            for (int j = arr.length-1; j > pos; j--) {
            arr[j] = arr[j - 1];
        }
        len++;

 arr[pos] = value;
//        System.out.println("Output: ");
//        for (int i = 0; i < len; i++) {
//            System.out.print(a[i] + " ");
//        }

            // C2: array 1 (len) -> array 2 (len - 1)
//            Scanner scanner = new Scanner(System.in);
//            int[] a = {5, 4, 9, 8, 12, 8};
//
//            System.out.println("Input value: ");
//            int value = scanner.nextInt();
//
//            int count = 0;
            // 5, 4, 9, 12, 8
            // a.length = 6, count = 1
//            for (int i = 0; i < a.length - count; i++) {
//                if (a[i] == value) {
//                    int pos = i;

                    // pos = 3, a.length = 6, count = 0
//                    for (int j = pos; j < a.length - count - 1; j++) {
//                        a[j] = a[j + 1];
//                    }
//                    count++;
//                }
//            }

//        int[] b = new int[arr.length + 1];
            int[] b = Arrays.copyOf(arr, len);
            System.out.println(Arrays.toString(b));
        }
    }