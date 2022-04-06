package com.base.leetCode.回溯算法;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 回溯算法解决全排列代码 {

    private static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        permute(new int[]{1,2,3});
        System.out.println(JSON.toJSONString(res));
    }

    public static List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        tacktrack(nums, track, used);
        return res;
    }

    public static void tacktrack(int[] nums, LinkedList<Integer> track, boolean[] used) {
        if (nums.length == track.size()) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            track.add(nums[i]);
            used[i] = true;
            tacktrack(nums, track, used);
            track.removeLast();
            used[i] = false;
        }
    }
}
