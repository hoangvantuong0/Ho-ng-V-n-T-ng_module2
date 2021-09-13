package _01_introduction_java.practice;

import java.util.Scanner;

public class testkiemtra {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String str = input.nextLine();
        char arrayStr[] = new char[str.length()];
        boolean flag = true;
        for (int i = 0; i < arrayStr.length; i++) {
        for (int j = 0; j < i; j++) {
           if( arrayStr[i] == str.charAt(i)){
              flag =true;
           }

            }
            if(flag == false){
                count = count + 1;

        }
            }
        System.out.println("Number of different characters are: " + (str.length() -count));
        }

}