package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElementInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,0,0,0,0};
        int number;
        int del;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you wanna delete: ");
        number = scanner.nextInt();
        System.out.println("array before delete");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                del = i;
                isExist = true;
                System.out.println();
                for (int j = del; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                System.out.println("array after delete");
                for (int element : array) {
                    System.out.print(element + " ");
                }
            }
        }if (!isExist){
            System.out.println("Not found "+ number + " in the array.");
        }
    }
}