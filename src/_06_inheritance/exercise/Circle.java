package _06_inheritance.exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area;

    public Circle() {

    }

    public Circle(double radius) {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.PI * this.radius * this.radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", Area =" + getArea() +
                '}';
    }
}
