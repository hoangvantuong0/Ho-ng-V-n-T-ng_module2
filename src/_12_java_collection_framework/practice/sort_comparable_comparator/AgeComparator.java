package _12_java_collection_framework.practice.sort_comparable_comparator;

import _12_java_collection_framework.practice.distinction_hashmap_hashset.Students;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }

    }
}
