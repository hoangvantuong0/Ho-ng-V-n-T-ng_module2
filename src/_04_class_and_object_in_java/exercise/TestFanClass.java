package _04_class_and_object_in_java.exercise;

public class TestFanClass {
    public static class Main {
        public static void main(String[] args) {
            FanClass fanClass1 = new FanClass(3, true, 10, "yellow");
            System.out.println(fanClass1.toString());
            FanClass fanClass2 = new FanClass(2, false, 5, "blue");
            System.out.println(fanClass2.toString());
        }
    }
}
