package com.base.leetCode.二叉树;

//给定一个二叉树，找出其最大深度。
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//
// 说明: 叶子节点是指没有子节点的节点。
//
// 示例：
//给定二叉树 [3,9,20,null,null,15,7]，
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
// 返回它的最大深度 3 。
public class 二叉树的最大深度 {

    /**
     * 动态规划问题
     * @param treeNode
     * @return
     */
    public int maxDepth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = maxDepth(treeNode.left);
        int right = maxDepth(treeNode.right);
        return 1+Math.max(left, right);
    }

}

