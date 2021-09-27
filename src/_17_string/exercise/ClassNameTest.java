package _17_string.exercise;

public class ClassNameTest {
    private static ClassName className;
    public static final String[] validClassName = new String[]{"C0721G"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String class1 : validClassName){
            boolean isValid = className.validate(class1);
            System.out.println("Class Name " + class1 + " is valid " + isValid);
        }
        for (String class2 : invalidClassName){
            boolean isValid = className.validate(class2);
            System.out.println("Class name " + class2 + " is valid " + isValid);
        }
    }
}
