package _05_access_modifier_static_method_static_property.exercise;

public class Circle {
   private double radius = 1.0;
   private String color = "red";

public Circle(){

}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    double getArea(){
    return (Math.PI*this.radius*this.radius);
    }
}