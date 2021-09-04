package _02_loops_in_java.exercise;

import java.util.Scanner;

public class Display20Primes {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int n = 2;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        numbers = scanner.nextInt();
        while (count < numbers) {
            flag = true;
            if (numbers < 2) {
                flag = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(n);
                    count++;
                }
                n++;
            }
        }
    }
}