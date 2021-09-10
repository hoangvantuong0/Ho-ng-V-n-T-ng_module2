package _06_inheritance.exercise;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    public MoveablePoint move() {
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return " MoveablePoint {" +
                " x =" + super.getX() +
                ", y =" + super.getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                Arrays.toString(getXY()) + '}';
    }
}
