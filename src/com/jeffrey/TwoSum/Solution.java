package com.jeffrey.TwoSum;

/**
 * Created at 2021-12-23
 *
 * @author jeffrey.hu
 **/
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;

            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                } else {
                    j++;
                }
            }

        }
        return new int[]{};
    }


}
