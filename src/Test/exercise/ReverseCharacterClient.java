package Test.exercise;

import java.util.Stack;

public class ReverseCharacterClient {

    public static void reverse(StringBuffer s){
        int n = s.length();
        Stack obj = new Stack();

        int i;
        for(i = 0; i < n; i++){
            obj.push(s.charAt(i));
        }

        for(i = 0; i < n; i++){
            Object ch = obj.pop();
            s.setCharAt(i, (Character) ch);
        }
    }

    public static void main(String args[]){

        StringBuffer s= new StringBuffer("CodeGyme Đà Nẵng");

        reverse(s);

        System.out.println(s);
    }
}
