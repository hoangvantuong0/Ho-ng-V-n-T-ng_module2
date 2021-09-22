package _15_debug.exercise;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String errorException) {
        super(errorException);
    }
}
