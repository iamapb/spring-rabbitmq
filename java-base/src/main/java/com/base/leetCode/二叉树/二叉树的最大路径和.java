package com.base.leetCode.二叉树;

/**
 * 路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。同一个节点在一条路径序列中 至多出现一次 。该路径 至少包含一个 节点，且不一定经过根节点。
 *
 * 路径和 是路径中各节点值的总和。
 *
 * 给你一个二叉树的根节点 root ，返回其 最大路径和
 */

public class 二叉树的最大路径和 {
    int maxNum = Integer.MIN_VALUE;
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);
        maxNum = Math.max(maxNum, left + root.val + right);
        int pathSum = Math.max(Math.max(0, left), right);
        return pathSum < 0 ? 0 : pathSum;
    }

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxNum;
    }
}
