package _11_dsa_stack_queue.exercise;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "CodeGym Da Nang";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.println(stack);
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 += stack.pop();
        }
        System.out.println(str1);
    }
}