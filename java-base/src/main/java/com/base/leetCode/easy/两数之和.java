package com.base.leetCode.easy;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//
// 你可以按任意顺序返回答案。
//
//
//
// 示例 1：
//
//
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//
public class 两数之和 {

        public static int[] twoSum(int[] nums, int target) {
            int[] data = null;
            int len = nums.length;
            if (len == 0) {
                return null;
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                map.put(nums[i], i);
            }

            for (int i = 0; i < len; i++) {
                int result = target - nums[i];
                if (map.containsKey(result) && i !=map.get(result)) {
                    data = new int[]{i, map.get(result)};
                }
            }
            return data;
        }

        public static void main(String[] args) {
            int[] num = new int[]{1, 2, 3, 4, 8, 29};
            int[] result = twoSum(num, 30);
            System.out.println(JSON.toJSONString(result));
        }
}
