package _06_inheritance.exercise;

public class MoveableTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint  =new MoveablePoint(3.0f, 4.0f, 5.0f, 5.0f);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move()[0]+ ", " +moveablePoint.move()[1]);
    }
}
