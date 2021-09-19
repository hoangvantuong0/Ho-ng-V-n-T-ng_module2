package _12_java_collection_framework.practice.sort_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        Students student = new Students("Kien", 30, "HT");
        Students student2 = new Students("Hoang", 40, "HN");
        Students student3 = new Students("Khanh", 23, "SG");
        Students student4 = new Students("Minh", 25, "HT");
        Students student5 = new Students("Linh", 25, "HT");

        List<Students> lists = new ArrayList<Students>();
        lists.add(student);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        lists.add(student5);
        Collections.sort(lists);

        for (Students st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists);
        System.out.println("So sánh theo tuổi: ");
        for (Students st : lists) {
            System.out.println(st.toString());
        }
    }
}


















