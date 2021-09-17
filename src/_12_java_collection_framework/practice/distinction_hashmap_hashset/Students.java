package _12_java_collection_framework.practice.distinction_hashmap_hashset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Students {
        private String name;
        private int age;
        private String address;

        public Students() {
        }

        public Students(String name, int age, String address) {
            super();
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student@name=" + name + ",age=" + age + ",address=" + address;
        }
    public static class Main {

        public static void main(String[] args) {
            Students student1 = new Students("Nam",20, "HN");
            Students student2 = new Students("Hung",21, "HN");
            Students student3 = new Students("Ha",22, "HN");

            Map<Integer, Students> studentMap = new HashMap<Integer, Students>();
            studentMap.put(1,student1);
            studentMap.put(2,student2);
            studentMap.put(3,student3);
            studentMap.put(4,student1);

            for(Map.Entry<Integer, Students> student : studentMap.entrySet()){
                System.out.println(student.toString());
            }
            System.out.println("...........Set");
            Set<Students> students = new HashSet<Students>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student1);

            for(Students student : students){
                System.out.println(student.toString());
            }
        }
    }
    }
