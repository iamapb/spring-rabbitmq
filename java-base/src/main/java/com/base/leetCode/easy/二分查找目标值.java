package com.base.leetCode.easy;

public class 二分查找目标值 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,8,9,10,14};
        System.out.println(search(nums, 14));
    }


    public static int search(int nums[], int target) {
        int targetIndex = -1;
        int left = 0;
        int right = nums.length -1;
        int mid;
        while (left <= right ) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                targetIndex = mid;
                break;
            } else if (nums[mid] > target) {
                right = mid -1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return targetIndex;
    }
}
