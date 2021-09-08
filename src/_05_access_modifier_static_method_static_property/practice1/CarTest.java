package _05_access_modifier_static_method_static_property.practice1;

public class CarTest {
    public static void main(String[] args) {
                CarClass car1 = new CarClass("Mazda 3","Skyactiv 3");
                System.out.println(CarClass.numberOfCars);
            CarClass car2 = new CarClass("Mazda 6","Skyactiv 6");
                System.out.println(CarClass.numberOfCars);
        CarClass car3 = new CarClass("Toyota","Skyactiv 6");
        System.out.println(CarClass.numberOfCars);
            }
        }
