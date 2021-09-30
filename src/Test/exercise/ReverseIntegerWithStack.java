package Test.exercise;

class ReverseIntegerWithStack {
    int size;
    int top;
    int[] a;

    boolean isEmpty() {
        return (top < 0);
    }

    ReverseIntegerWithStack(int n) {
        top = -1;
        size = n;
        a = new int[size];
    }

    boolean push(int i) {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = i;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
           int i = a[top--];
            return i;
        }
    }
}











