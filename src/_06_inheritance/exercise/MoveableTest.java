package _06_inheritance.exercise;

public class MoveableTest {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(3,4);
        moveablePoint.setX(0);
        moveablePoint.setY(0);
        moveablePoint.setxSpeed(2);
        moveablePoint.setySpeed(3);
        System.out.println(moveablePoint.move().move().move());
    }
}
