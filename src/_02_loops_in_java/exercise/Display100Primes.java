package _02_loops_in_java.exercise;

public class Display100Primes {
    public static void main(String[] args) {
        int numbers, count = 0;
        int status = 1;
        int num = 3;
        System.out.println("100 số nguyên tố đầu tiên là:");
        System.out.println(2);
        for (int i = 2; i <= 100; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
                count++;
            }
            status = 1;
            num++;
        }
    }
}
