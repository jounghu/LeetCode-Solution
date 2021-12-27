package com.jeffrey.reverseInt;

/**
 * 通过 取模运算获得尾数，除法运算获取结果，最终判断是否越界
 *
 * Long ans = 0L;
 *
 *
 * while(x!=0){
 *    ans = ans * 10 + x % 10;
 *    x = x/10;
 * }
 *
 * (int) x==x? 可以判断是否越界
 *
 *
 */
class Solution {
    public int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }

        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = -x;
        }

        Long ans = 0L;

        while (x >= 10) {
            int mod = x % 10;
            x = x / 10;

            ans += mod;
            ans *= 10;
            if (ans > Integer.MAX_VALUE) {
                return 0;
            }
        }

        ans += x;

        ans = neg ? -ans : ans;

        if (ans > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }

        return ans.intValue();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-1563847412));

    }
}