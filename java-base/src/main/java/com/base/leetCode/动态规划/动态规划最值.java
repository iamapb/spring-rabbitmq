package com.base.leetCode.动态规划;

/**
 * 动态规划问题的一般形式就是求最值。
 * 动态规划其实是运筹学的一种最优化方法，只不过在计算机问题上应用比较多，
 * 比如说让你求最长递增子序列呀，最小编辑距离呀等等
 */
public class 动态规划最值 {

    public static int fib(int n) {
        int[] emo = new int[n + 1];
        return helpNum(emo, n);

    }
    public static int helpNum(int[] emo, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (emo[n] != 0) return emo[n];
        emo[n] = helpNum(emo, n -1) + helpNum(emo, n -2);
        return emo[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(20));
    }
}
