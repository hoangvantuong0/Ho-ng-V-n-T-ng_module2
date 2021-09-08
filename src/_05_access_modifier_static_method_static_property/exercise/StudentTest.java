package _05_access_modifier_static_method_static_property.exercise;

public class StudentTest {
    public static void main(String[] args) {
        StudentClass studentClass  = new StudentClass();
        studentClass.setName("Pop");
        studentClass.setClasses("C03");
        System.out.println("Name and class: " + studentClass.toString());
    }
}
