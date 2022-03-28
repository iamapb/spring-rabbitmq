package com.java.base.leetCode.easy;

//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//
// 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//
// 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
//

/**
 * 解题思路: 使用的是覆盖法进行数组的重新排序 有两个指针 一个指针是去循环  一个指针是记录比较的结果  不适用额外的空间的话 就
 * 是进行空间的移动
 */
public class 移除元素 {
    public static int removeElement(int [] nums, int val) {
        int length = nums.length;
        int left = 0;
        for (int right = 0; right < length; right ++) {
            if(nums[right] != val) {
                nums[left]= nums[right];
                left ++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2,2,3,5,6,7}, 2));
    }
}
