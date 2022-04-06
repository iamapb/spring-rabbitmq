package com.base.leetCode.二叉树;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的前序遍历 {
    private static final List<Integer> preList = new ArrayList<>();

    List<Integer> preorder(TreeNode treeNode) {
        traverse(treeNode);
        return preList;
    }
    public void traverse(TreeNode treeNode) {

        if (treeNode == null) {
            return;
        }
        preList.add(treeNode.val);
        traverse(treeNode.left);
        traverse(treeNode.right);
    }
}
