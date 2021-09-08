package _04_class_and_object_in_java.exercise;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number for a: ");
        double a = scanner.nextInt();
        System.out.println("Input a number for b: ");
        double b = scanner.nextInt();
        System.out.println("Input a number for c: ");
        double c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDelta() > 0) {
            System.out.println("Quadratic Equation has 2 roots");
            System.out.println("Root1: " + quadraticEquation.getRoot1() + " and " + "Root2: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("Quadratic Equation has 1 root");
            System.out.println("Root1: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
    }
}
