package _10_dsa_list.exercise;

import java.util.ArrayList;
import java.util.List;

public class MyList1Test {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        myList1.add("a");
        myList1.add("b");
        myList1.add("s");
        System.out.println(myList1.size());
        List<String> myList2 = new ArrayList<>();
        myList2.add("v");
        myList2.add("t");
        myList2.add("r");
        myList1.addAll(myList2);
        System.out.println(myList1);
        myList1.remove(5);
        System.out.println(myList1);
        myList1.get(3);
        System.out.println(myList1);
    }
}
