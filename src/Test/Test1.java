package Test;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String s = "abcdabc";
        String s1  ="abdcs";
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
            System.out.println(c);
        }
    }

}
