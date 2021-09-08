package _05_access_modifier_static_method_static_property.practice1;

public class CarClass {
    private String name;
    private String engine;
    public static int numberOfCars;

    public CarClass(String name, String engine) {
        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }
}
