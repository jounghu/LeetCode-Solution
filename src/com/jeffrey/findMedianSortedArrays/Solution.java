package com.jeffrey.findMedianSortedArrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) {
            return 0.0;
        }

        int n = nums1 == null ? 0 : nums1.length;
        int m = nums2 == null ? 0 : nums2.length;

        int max = n + m;
        int[] arr = new int[max];

        int i = 0;
        int j = 0;
        for (int ai = 0; ai < max; ai++) {
            Integer tmp1 = nums1 == null || i >= nums1.length ? null : nums1[i];
            Integer tmp2 = nums2 == null || j >= nums2.length ? null : nums2[j];

            if (tmp1 == null) {
                arr[ai] = tmp2;
                j++;
            } else if (tmp2 == null) {
                arr[ai] = tmp1;
                i++;
            } else {

                if (tmp1 <= tmp2) {
                    arr[ai] = tmp1;
                    i++;
                } else {
                    arr[ai] = tmp2;
                    j++;
                }


            }

        }

        return (max) % 2 == 0 ? (arr[max / 2 - 1] + arr[max / 2 + 1]) / 2.0d : arr[max / 2 + 1] / 2.0;
    }
}
