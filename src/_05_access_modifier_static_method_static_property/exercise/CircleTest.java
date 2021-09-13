package _05_access_modifier_static_method_static_property.exercise;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Circle circle1 = new Circle(3);
        circle.getArea();
        circle.getRadius();
        circle1.getArea();
        circle1.getRadius();
        System.out.println("The Area is: " + circle.getArea());
        System.out.println("The Area of circle1 is: " + circle1.getArea() + " the radius is: " + circle1.getRadius());
    }
}
