package _11_dsa_stack_queue.exercise;

import java.util.Arrays;
import java.util.Locale;
import java.util.TreeMap;

public class CountDigit {
    public static void main(String[] args) {

        String str = "Hello my name is Tuong, I am from Da Nang, what is your name ? and where are you from ?";
        str = str.toLowerCase(Locale.ROOT).replaceAll(",", "");
        String[] arrayString = str.split(" ");
        System.out.println(Arrays.toString(arrayString));
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        int value = 1;
        String key;
        for (int i = 0; i < arrayString.length; i++) {
            key = arrayString[i];
            if (treeMap.containsKey(key)) {
                treeMap.put(key, treeMap.get(key) + 1);
            } else {
                treeMap.put(key, value);
            }
        }
        System.out.println(treeMap);
    }
}
