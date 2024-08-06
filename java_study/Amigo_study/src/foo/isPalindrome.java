package foo;

import java.util.Locale;

public class isPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() < 1) return false;
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right){
            if (!Character.isAlphabetic(s.charAt(left)) && Character.isAlphabetic(s.charAt(right))){
                left++;
                continue;
            }else if (Character.isAlphabetic(s.charAt(left)) && !Character.isAlphabetic(s.charAt(right))){
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)){return false;}
            left++;
            right--;
        }
        return true;
    }
}
