package _01_introduction_java;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int num;
        int count = 0;
        int n = 2;
        char result = ' ';
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        num = scanner.nextInt();
        while (count < num) {
            flag = true;
            if (n < 2) {
                flag = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag == true) {
                System.out.println(n);
                count++;
            }
            n++;
        }

    }
}

//                if (numbers >= 1) {
//                    System.out.println(numbers + " Số nguyên tố đầu tiên là:");
//                    System.out.println(2);
//                }
//                for (int i = 2; i <= numbers; i++) {
//                        if (num % i == 0) {
//                            count = 0;
//                            break;
//                        }
//                    }
//                    if (count != 0) {
//                        System.out.println(num);
//                    }
//                    count = 1;
//                    num++;
//                }
//            }

//
//
//    let num = prompt("nhập số lượng số nguyên tố");
//    let count = 0;
//    let n = 2;
//    let flag = true;
//    let result ="";
//  while (count<num){
//        let flag = true;
//        if (num<2) {
//        flag =  false;
//        } else {
//        for (let i =2; i<n; i++){
//        if(n%i==0){
//        flag = false;
//        break;
//        }
//        }
//        }
//
//        if (flag) {
//        result += n +','
//        count++
//        }
//        n++
//        }
//        alert(result)