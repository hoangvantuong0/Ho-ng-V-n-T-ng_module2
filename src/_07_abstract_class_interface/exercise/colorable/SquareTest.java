package _07_abstract_class_interface.exercise.colorable;


public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(5);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println("The Circle's area is: " + ((Circle) shapes[i]).getArea());
            } else if (shapes[i] instanceof Square) {
                System.out.println("The Square's area is: " + ((Square) shapes[i]).getArea());
                ((Square) shapes[i]).howToColor("");
            } else {
                System.out.println("The Rectangle's area is: " + ((Rectangle) shapes[i]).getArea());
            }
        }
    }
}
