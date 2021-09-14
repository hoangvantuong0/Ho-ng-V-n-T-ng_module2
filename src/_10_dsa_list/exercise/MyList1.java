package _10_dsa_list.exercise;

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

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
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

    public boolean containsTrue(boolean[] array) {

        for (boolean val : array) {
            if (val)
                return true;
        }
        return false;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
            size = 0;
        }
    }
}