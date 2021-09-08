package _05_access_modifier_static_method_static_property.exercise;

public class StudentClass {
    private String name = "John";
    private String classes = "C02";
    StudentClass(){
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
