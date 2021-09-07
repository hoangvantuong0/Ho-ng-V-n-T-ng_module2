package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMinimumElementInTheArray {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = input.nextInt();

        int array[] = new int[size];
        System.out.println("Enter value for elements: ");
        for (int i = 0; i < size; i++){
                System.out.print("Element " + (i+1)  + ": ");
                array[i]= input.nextInt();
            }
        int min = array[0];
        int index = 0;
        for (int i = 0; i<size; i++){
                if(min > array[i]){
                    min = array[i];
                    index = i;
                }
            }
        System.out.print("The min value element in the array is: " + min + " at position index: " + index);
    }
}
