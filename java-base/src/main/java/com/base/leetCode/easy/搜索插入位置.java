package com.base.leetCode.easy;

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 请必须使用时间复杂度为 O(log n) 的算法。
//
//
//
// 示例 1:
//
//
//输入: nums = [1,3,5,6], target = 5
//输出: 2
//
//
// 示例 2:
//
//
//输入: nums = [1,3,5,6], target = 2
//输出: 1
//

/**
 * 解题思路 使用二分查找进行数据的查询
 */
public class 搜索插入位置 {

    public static int select(int[] nums, int target) {
        int end = nums.length - 1;
        int begin = 0;
        while (begin < end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return begin;
    }
    public static void main(String[] args) {
        System.out.println(select(new int[]{1,2,3,5,6}, 4));
    }
}
