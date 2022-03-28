package com.java.base.leetCode.easy;

//给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
//
// 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//
//
//
// 说明:
//
// 为什么返回数值是整数，但输出的答案是数组呢?
//
// 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
//
// 你可以想象内部操作如下:
//
//
//// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
//int len = removeDuplicates(nums);
//
//// 在函数里修改输入数组对于调用者是可见的。
//// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//}
//
//
//
// 示例 1：
//
//
//输入：nums = [1,1,2]
//输出：2, nums = [1,2]
//解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
//
//

/**
 * 解法： 双指针
 *
 * 首先注意数组是有序的，那么重复的元素一定会相邻。
 *
 * 要求删除重复元素，实际上就是将不重复的元素移到数组的左侧。
 *
 * 考虑用 2 个指针，一个在前记作 p，一个在后记作 q，算法流程如下：
 *
 * 1.比较 p 和 q 位置的元素是否相等。
 *
 * 如果相等，q 后移 1 位
 * 如果不相等，将 q 位置的元素复制到 p+1 位置上，p 后移一位，q 后移 1 位
 * 重复上述过程，直到 q 等于数组长度。
 *
 * 返回 p + 1，即为新数组长度。
 * 有序的情况下 去进行替换
 */
public class 删除有序数组中的重复项 {

    public static int deleteCopyNum(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[j]) {
                j = j + 1;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        System.out.println(deleteCopyNum(new int[]{0,0,1,1,2,3,3,4,5}));
    }
}
