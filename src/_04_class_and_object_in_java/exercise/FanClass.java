package _04_class_and_object_in_java.exercise;

public class FanClass {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    boolean onOf = false;
    double radius = 5;
    String color = "blue";

    public FanClass (int speed, boolean onOf, double radius, String color){
        this.speed = speed;
        this.onOf = onOf;
        this.radius = radius;
        this.color = color;
    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOnOf() {
        return onOf;
    }

    public void setOnOf(boolean onOf) {
        this.onOf = onOf;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (onOf) {
            return "FanClass{" +
                    " speed=" + speed +
                    ", radius=" + radius +
                    ", fan is on" +
                    ", color='" + color + '\'' +
                    '}';
        } else return "FanClass{" +
                ", fan is off" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}