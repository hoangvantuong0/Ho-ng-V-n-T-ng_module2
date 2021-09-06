package _03_array_and_method_in_java.exercise;

public class AddAnElementIntoTheArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,0,0,0,0};
        int atIndex = 8;
        int value = 9;
        System.out.println("The array before add an element: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int j = arr.length-1; j > atIndex; j--) {
            arr[j] = arr[j - 1];
        }
        arr[atIndex] = value;
        System.out.println("array after add an element");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
