package org.nullhint._012_matrixPath;

public class Solution {

    /**
     * 判断矩阵中是否存在某个字符串所有字符的路径。
     * <p>
     * 解题思路：使用回溯法解题，同时使用一个同等的大小布尔数组记录走过的路径。<br>
     * 时间复杂度O(n^2)，空间复杂度O(n)。
     *
     * @param matrix 矩阵
     * @param str    字符串
     * @return true-存在,false-不存在
     */
    public static boolean solve(char[][] matrix, String str) {
        if (matrix == null || matrix.length <= 0 || str == null || str.length() <= 0) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean[][] existArray = new boolean[matrix.length][matrix[0].length];
                if (match(matrix, i, j, str, 0, existArray)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * 递归查找。
     *
     * @param matrix     二维数组
     * @param x          x坐标
     * @param y          y坐标
     * @param str        要匹配的字符串
     * @param index      要匹配的字符串第几项
     * @param existArray 记录走过路径的二维数组
     * @return true-匹配成功，false-匹配失败
     */
    private static boolean match(char[][] matrix, int x, int y, String str, int index, boolean[][] existArray) {
        if (index >= str.length()) {
            return true;
        }

        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[x].length) {
            return false;
        }

        if (existArray[x][y]) {
            return false;
        }

        if (matrix[x][y] == str.charAt(index)) {
            existArray[x][y] = true;
            index++;
            return match(matrix, x, y - 1, str, index, existArray)
                    || match(matrix, x + 1, y, str, index, existArray)
                    || match(matrix, x, y + 1, str, index, existArray)
                    || match(matrix, x - 1, y, str, index, existArray);
        } else {
            existArray[x][y] = false;
        }

        return false;
    }
}
