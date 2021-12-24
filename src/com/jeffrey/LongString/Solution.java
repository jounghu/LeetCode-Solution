package com.jeffrey.LongString;


/**
 * Created at 2021-12-23
 *
 * @author jeffrey.hu
 **/
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.equals("")) {
            return 0;
        }

        char[] arr = s.toCharArray();

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;

            while (j <= arr.length - 1) {

                if (arr[j] == arr[i]) {
                    break;
                }
                int tmp = i + 1;
                boolean flag = false;
                while (tmp < j) {
                    if (arr[tmp] == arr[j]) {
                        flag = true;
                        break;
                    }
                    tmp++;
                }

                if (flag) {
                    break;
                }
                j++;

            }
            max = (j - i) > max ? j - i : max;
        }
        return max == 0 ? 1 : max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcb"));
    }


}
