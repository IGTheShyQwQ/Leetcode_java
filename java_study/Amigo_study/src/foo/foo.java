package foo;

import java.util.*;

public class foo {


    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println((longestPalindrome(s)));

    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++){
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i+1);
            int max_len = Math.max(len1, len2);

            if (max_len > right - left){
                //aabb
                left = i - (max_len - 1) / 2;
                right = i + max_len / 2;
            }

        }
        return s.substring(left, right+1);
    }

    public static Integer expand(String s, Integer left, Integer right){
        // rac e car
        // aa b b aa
        if (s == null || s.length() < 1) return 0;
        //String s = "babab";
        // aa b aa
        while(left >= 0 && right < s.length() && s.charAt(left)== s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;

    }















//    public static String longestPalindrome(String s) {
//        if (s == null || s.length() < 1) return "";
//
//        int left = 0;
//        int right = 0;
//        for (int i = 0; i < s.length(); i++){
//            // rac e car 7 LEFT = 0 RIGHT = 6
//            // aa b b aa 6 LEFT = 0 RIGHT = 5
//            int len1 = expand(s, i, i);
//            int len2 = expand(s, i, i+1);
//            int max_len = Math.max(len1, len2);
//            if (max_len > right - left) {
//                System.out.println(max_len);
//                System.out.println(max_len/2);
//                left = i - (max_len / 2);
//                System.out.println(left);
//                right = i + (max_len / 2);
//            }
//        }
//        return s.substring(left, right+1);
//    }
//
//    public static Integer expand(String s, Integer left, Integer right){
//        // rac e car
//        // aa b b aa
//        if (s == null || s.length() < 1) return 0;
//        //String s = "babab";
//        while(left >= 0 && right < s.length() && s.charAt(left)== s.charAt(right)){
//            left--;
//            right++;
//        }
//        return right - left - 1;
//
//    }

}
