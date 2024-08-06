package foo;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int res = romanToInt(roman);
        System.out.println(res);
    }
    public static int romanToInt(String s) {
        int value = 0;
        if (s == null || s.length() < 1) return 0;

        Map<Character, Integer> roman_map = new HashMap<>();
        roman_map.put('I', 1);
        roman_map.put('V', 5);
        roman_map.put('X', 10);
        roman_map.put('L', 50);
        roman_map.put('C', 100);
        roman_map.put('D', 500);
        roman_map.put('M', 1000);

        //"MCM XCIV";
        int cur = roman_map.get(s.charAt(0));
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int next = roman_map.get(s.charAt(i));

            if (cur < next){
                sum -= cur;
            }else sum += cur;
            cur = next;
        }
        sum += cur;
        return sum;
    }
}
