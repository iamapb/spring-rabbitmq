package com.java.base.leetCode.easy;

//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//
//回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
//

/**
 * 思路
 * 先判断这个数字合不合法
 * 我们就拿前一半的数据去操作  一直除以10 获取余数
 */
public class 回文数 {

    public static boolean isValid(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (number > revertedNumber) {
            revertedNumber = revertedNumber * 10 + number % 10; // 核心
            number /= 10;
        }
        return number == revertedNumber || number == revertedNumber / 10;
    }

    public static void main(String[] args) {
        System.out.println(isValid(12321));
    }
}
