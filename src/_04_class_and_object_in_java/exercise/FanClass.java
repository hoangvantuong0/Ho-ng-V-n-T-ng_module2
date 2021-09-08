package _04_class_and_object_in_java.exercise;

public class FanClass {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public FanClass(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
    FanClass(){

    }
    public String toString(){
        if(this.on){
            return " - speed is: " + this.speed + ", color is: " + this.color + ", radius is: " + this.radius + ", fan is on ";
        }else {
            return " - color is: " + this.color + ", radius is: " + this.radius + ", fan is off ";
        }
    }
}


















