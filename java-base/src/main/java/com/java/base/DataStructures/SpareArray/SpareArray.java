package com.java.base.DataStructures.SpareArray;

/**
 * @author panbin
 * @date 2021年11月23日10:30 下午
 * 稀疏数组和二维数组的转换
 */
public class SpareArray {

    public static void main(String[] args) {
        // 先创建一个原始的二维数组 11 * 11
         int chessArray[][] = new int[11][11];
         chessArray[1][2] = 1;
         chessArray[2][3] = 2;
         for (int[] row: chessArray) {
             for (int data: row) {
                 System.out.printf("%d\t", data);
             }
             System.out.println();
         }
    }
}
