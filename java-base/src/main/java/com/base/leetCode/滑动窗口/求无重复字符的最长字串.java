package com.base.leetCode.滑动窗口;

import java.util.HashMap;
import java.util.Map;

//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//
//
//
// 示例 1:
//
//
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 使用滑动窗口进行求解


public class 求无重复字符的最长字串 {

    public static int lengthOfLongestSubString(String s) {
        int length = s.length();
        int max = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int start =0, end = 0; end < length; end++) {
            char element = s.charAt(end);
            if (map.containsKey(element)) {
                start = Math.max(map.get(element)+ 1, start);
            }
            max = Math.max(max, end - start + 1);
            map.put(element, end);
        }
        return max;
    }


    public static void main(String[] args) {
        int number = lengthOfLongestSubString("babdbadk22");
        System.out.println(number);
    }
}
