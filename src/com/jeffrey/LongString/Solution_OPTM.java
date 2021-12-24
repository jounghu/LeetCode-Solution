package com.jeffrey.LongString;

import java.util.HashSet;
import java.util.Set;

/**
 * Created at 2021-12-24
 *
 * @author jeffrey.hu
 **/
public class Solution_OPTM {

    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.equals("")) {
            return 0;
        }
        char[] arr = s.toCharArray();

        int n = arr.length;
        int max = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0, j = 0; i < n; i++) {
            if (i > 0) {
                set.remove(arr[i - 1]);
            }

            while (j <= n - 1) {

                if (set.contains(arr[j])) {
                    // hit character
                    break;
                }

                set.add(arr[j]);

                j++;
            }
            max = (j - i) > max ? j - i : max;
        }
        return max == 0 ? 1 : max;
    }
}
