package _01_introduction_java.exercise;

import java.util.Scanner;

public class ExchangeMoneyApp {
    public static void main(String[] args) {
        long vnd = 23000;
        long usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money you want to exchange: ");
        usd = sc.nextLong();
        long exchange = usd * 23000;
        System.out.print("Your Vietnamese money is: "+ exchange);

    }
}








