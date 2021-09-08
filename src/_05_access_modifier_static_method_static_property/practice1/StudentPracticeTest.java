package _05_access_modifier_static_method_static_property.practice1;

public class StudentPracticeTest {
    public static void main(String[] args) {
            StudentPracticeClass.change(); //calling change method
            //creating objects
            StudentPracticeClass s1 = new StudentPracticeClass(111, "Hoang");
            StudentPracticeClass s2 = new StudentPracticeClass(222, "Khanh");
            StudentPracticeClass s3 = new StudentPracticeClass(333, "Nam");
            //calling display method
            s1.display();
            s2.display();
            s3.display();
        }
    }

