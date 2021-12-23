package com.jeffrey.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created at 2021-12-23
 * 两数相加优化
 * @author jeffrey.hu
 **/
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curNum  = nums[i];
            Integer index = hashMap.get(target - curNum);
            if(index==null){
                hashMap.put(curNum,i);
            }else{
                return new int[]{i,index};
            }
        }

        return new int[]{};
    }


}
