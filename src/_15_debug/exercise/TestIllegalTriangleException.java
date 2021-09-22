package _15_debug.exercise;

import java.util.Scanner;

public class TestIllegalTriangleException {
    public static int checkSide(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("input numbers are negative numbers");
        }
        if ((a + b) <= c) {
            throw new IllegalTriangleException("sum of the length of a and b must be greater than c");
        }
        if ((a + c) <= b) {
            throw new IllegalTriangleException("sum of the length of a and c must be greater than b");
        }
        if ((b + c) <= a) {
            throw new IllegalTriangleException("sum of the length of b and c must be greater than a");
        }
        return a;
    }

    public static void main(String[] args) throws IllegalTriangleException {
        boolean flag;
        do {
            flag = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a side's length: ");
            int a = scanner.nextInt();
            System.out.println("Enter b side's length: ");
            int b = scanner.nextInt();
            System.out.println("Enter c side's length: ");
            int c = scanner.nextInt();
            try {
                a = checkSide(a, b, c);
                System.out.println("The triangle with three side a: " + a + ", b: " + b + ", c: " + c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);

    }
}