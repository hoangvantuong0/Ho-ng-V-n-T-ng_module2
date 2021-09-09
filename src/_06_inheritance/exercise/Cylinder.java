package _06_inheritance.exercise;

public class Cylinder extends Circle {
    private double height = 0.0;
    public Cylinder(){
    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return (this.height*super.getArea());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " height=" + height +
                " radius=" + super.getRadius() +
                " color=" + super.getColor() +
                ", Volume=" + getVolume() +
                '}';
    }
}
