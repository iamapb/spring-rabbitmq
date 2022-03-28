package com.java.base.leetCode.easy;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

import static java.util.Arrays.sort;

/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 *
 * 解法：从后往前便利比较，使用双指针的解法，时间复杂度和空间复杂度都可以
 */
public class 合并两个有序数组 {

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {3,5,6};
        merge(num1, 6, num2, 3);
    }

    public static   void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
        System.out.println(JSON.toJSONString(nums1));
    }
}
