package _11_dsa_stack_queue.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseNumbers {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter array size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 10)
                System.out.println("size should not exceed 10");

        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("enter element" + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        Stack<Integer> stack = new Stack<>();
        for (int j = 0; j < array.length; j++) {
            stack.push(array[j]);
        }
        System.out.println(stack);
        for (int j = 0; j < array.length; j++) {
            array[j] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < array.length; i++) {
//            stack.push(array[i]);
//        }
//        System.out.println(stack);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = stack.pop();
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}
