package com.jeffrey.longestPalindrome;

public class Solution {

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();


        String maxArr = null;

        // "babad"
        for (int k = 0; k < chars.length; k++) {

            int i = k,iIndex = k;
            int j = chars.length - 1,jIndex = chars.length-1;
            int star = k;
            boolean last = false;
            while (i <= j) {

                if (chars[i] == chars[j]) {
                    if (!last) {
                        star = j;
                        last = true;
                    }
                    i++;
                    j--;
                } else {
                    j = --jIndex;
                    i = iIndex;
                    last = false;
                }
            }

            if (maxArr == null) {
                maxArr = s.substring(k, star + 1);
            } else {
                maxArr = maxArr.length() >= star - k + 1 ? maxArr : s.substring(k, star + 1);
            }


        }

        return maxArr;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("aacabdkacaa"));
    }

}
