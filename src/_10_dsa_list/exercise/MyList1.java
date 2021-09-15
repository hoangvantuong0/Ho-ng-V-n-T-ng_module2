package _10_dsa_list.exercise;

import java.util.Arrays;

public class MyList1<E> {
    private int size = 0;
    private Object[] elements;
    public static final int DEFAULT_CAPACITY = 10;

    public MyList1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList1(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E e) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            if (size == elements.length) {
                ensureCapacity();
            }
            size++;
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
        }
    }

    public E remove(int index) {
        for (int i = index; i < DEFAULT_CAPACITY; i++) {
            if (i < size) {
                elements[i] = elements[i + 1];
            } else {
                elements[i] = null;
            }
        }
        size--;
        return (E) this.elements;
    }

    public int size() {
        return this.size;
    }

    public MyList1<E> clone() {
        MyList1<E> clone = new MyList1<E>();
        if (size == 0) {
            throw new NullPointerException();
        } else {
            for (int i = 0; i < size; i++) {
                clone.add(i, (E) elements[i]);
            }
        }
        return clone;
    }

    public boolean containsTrue(boolean[] array) {

        for (boolean val : array) {
            if (val)
                return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
            size = 0;
        }
    }
}
