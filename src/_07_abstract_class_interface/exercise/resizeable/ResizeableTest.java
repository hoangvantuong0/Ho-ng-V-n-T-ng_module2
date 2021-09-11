package _07_abstract_class_interface.exercise.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shape1 = new Shape[3];
        shape1[0] = new Circle(4);
        shape1[1] = new Rectangle(7, 6);
        shape1[2] = new Square(5);
        for (int i = 0; i < shape1.length; i++) {
            if (shape1[i] instanceof Circle) {
                System.out.println("Pre-resize:");
                System.out.println(((Circle) shape1[i]).getArea());
                ((Circle) shape1[i]).resize(Math.random() * 100);
                System.out.println("After-resize:");
                System.out.println(((Circle) shape1[i]).getArea());
            } else if (shape1[i] instanceof Square) {
                System.out.println("Pre-resize:");
                System.out.println(((Square) shape1[i]).getArea());
                ((Square) shape1[i]).resize(Math.random() * 100);
                System.out.println("After-resize:");
                System.out.println(((Square) shape1[i]).getArea());
            } else {
                System.out.println("Pre-resize:");
                System.out.println(((Rectangle) shape1[i]).getArea());
                ((Rectangle) shape1[i]).resize(Math.random() * 100);
                System.out.println("After-resize:");
                System.out.println(((Rectangle) shape1[i]).getArea());
            }

        }

    }
}
