package _02_loops_in_java.exercise;

public class Display100Primes {
    public static void main(String[] args) {
        int  count = 0;
        int n = 2;
        boolean flag = true;
        System.out.println("100 số nguyên tố đầu tiên là:");
        while (count < 100) {
            flag = true;
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
