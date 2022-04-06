package com.base.leetCode.回溯算法;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题目给你输入一个无重复元素的数组 nums，其中每个元素最多使用一次，请你返回 nums 的所有子集。
 */
public class 回溯算法解决所有子集问题 {

    private static List<List<Integer>> res = new ArrayList<>();

    // 记录回溯算法的递归路径
    public static LinkedList<Integer> track = new LinkedList<>();

    public static void main(String[] args) {
        int[] nums= new int[]{1,2,3};
        backtrack(nums, 0);
        System.out.println(JSON.toJSONString(res));

    }

    // 回溯算法核心函数，遍历子集问题的回溯树
    public static void backtrack(int[] nums, int start) {

        // 前序位置，每个节点的值都是一个子集
        res.add(new LinkedList<>(track));

        // 回溯算法标准框架
        for (int i = start; i < nums.length; i++) {
            // 做选择
            track.addLast(nums[i]);
            // 通过 start 参数控制树枝的遍历，避免产生重复的子集
            backtrack(nums, i + 1);
            // 撤销选择
            track.removeLast();
        }
    }
}
