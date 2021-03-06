package _07_abstract_class_interface.practice.comparable_circle;

import _06_inheritance.practice.Circle;

import java.util.Comparator;


class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}