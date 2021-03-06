package _04_class_and_object_in_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDelta() {

        return (this.b * b - 4 * this.a * this.c);
    }
    public double getRoot1() {
        if (getDelta() >= 0) {
            return (this.b * (-1) + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
        } else {
            return 0;
        }
    }
    public double getRoot2() {
        if (getDelta() >= 0) {
            return (this.b * (-1) - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
        } else {
            return 0;
        }
    }
}