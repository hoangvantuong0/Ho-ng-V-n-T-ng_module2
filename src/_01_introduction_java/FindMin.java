package _01_introduction_java;

public class FindMin {
    public static void main(String[] args) {
        int[] a = {5, 2, 1, 4, 12, 9, 6};
        int minNumber = a[0];
        for (int i = 0; i < a.length; i++) {
            if (minNumber > a[i]) {
                minNumber = a[i];
            }
        }
        System.out.println("Min = " + minNumber);
    }
}

