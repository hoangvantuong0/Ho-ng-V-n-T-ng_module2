package _06_inheritance.exercise;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0,"green");
        System.out.println(circle.toString());
        Cylinder cylinder  = new Cylinder(3.0, "Yellow", 2.0);
        System.out.println(cylinder.toString());
    }
}
