package _01_introduction_java.practice;

import java.util.Scanner;

public class UsingArithmetic {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        if (width<0) {
            System.out.printf("The number entered is invalid!\n");
        }
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        if (height<0) {
            System.out.printf("The number entered is invalid!\n");
        }
        float area = width * height;
                System.out.println(" Area is: " + area);
    }
}
