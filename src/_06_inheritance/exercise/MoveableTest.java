package _06_inheritance.exercise;

public class MoveableTest {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setX(3);
        moveablePoint.setY(4);
        moveablePoint.setxSpeed(2);
        moveablePoint.setySpeed(3);
        System.out.println(moveablePoint.move());
    }
}
