package _02_loops_in_java.exercise;

import java.util.Scanner;

public class DisplayShapes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the bottom-left triangle");
            System.out.println("3. Draw the top-left triangle");
            System.out.println("4. Draw the isosceles triangle ");
            System.out.println("0. Exit");
            choice = input.nextInt();
            if (choice == 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
            if (choice == 2) {
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            if (choice == 3) {
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            if (choice == 4) {
                int n = 5;
                int i;
                int j;
                int k;
                for (i = 1; i <= n; i++) {
                    for (k = n; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}





