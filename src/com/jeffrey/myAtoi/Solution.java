package com.jeffrey.myAtoi;

class Solution {

    public int myAtoi(String s) {
        if (s.length() == 0 || "".equals(s)) {
            return 0;
        }

        char[] arrs = s.toCharArray();

        int start = 0;

        int end = arrs.length - 1;

        while (arrs[start] == ' ') {
            start++;

            if (start == arrs.length) {
                break;
            }
        }

        while (arrs[end] == ' ') {
            end--;

            if (end < 0) {
                break;
            }
        }

        if (start >= arrs.length || end < 0) {
            return 0;
        }


        boolean neg = false;
        if (arrs[start] == '-' || arrs[start] == '+') {
            if (arrs[start] == '-') {
                neg = true;
            }
            start++;
        }

        Long ans = 0L;

        for (int i = start; i <= end; i++) {
            char c = arrs[i];
            if (c >= 'a' && c <= 'z') {
                break;
            }

            if (c >= 'A' && c <= 'Z') {
                break;
            }

            if (c == ' ') {
                break;
            }

            if (c == '+' || c == '-') {
                break;
            }

            if (c == '.') {
                break;
            }

            ans = ans * 10 + Integer.parseInt(c + "");

            if (ans > Integer.MAX_VALUE) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

        }

        ans = neg ? -ans : ans;

        return ans.intValue();
    }
}