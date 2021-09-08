package _04_class_and_object_in_java.exercise;

public class FanClassTest {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass(FanClass.FAST, true, 10, "yellow");
        FanClass fan2 = new FanClass(FanClass.MEDIUM, false, 5,"blue");
        System.out.println("fan 1: " + fan1.toString());
        System.out.println("fan 2: " + fan2.toString());
    }

}
