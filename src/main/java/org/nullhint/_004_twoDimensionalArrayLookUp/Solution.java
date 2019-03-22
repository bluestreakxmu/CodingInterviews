package org.nullhint._004_twoDimensionalArrayLookUp;

/**
 * “题目：二维数组中的查找”解法。
 *
 * @author lixibo
 */
public class Solution {

    /**
     * 判断二维数组中是否含有该整数。
     * <p>
     * 解题思路：从数据右上角（或左下角）开始比较。
     * <p>
     * 时间复杂度：O(2n)，空间复杂度：O(1)。
     *
     * @param array 二维数组
     * @param num   要查找的数字
     * @return true-有，false-没有
     */
    public static boolean solve(int[][] array, int num) {
        if (array == null || array.length <= 0) {
            return false;
        }

        int x = 0;
        int y = array[0].length - 1;
        while (y >= 0 && x <= array.length - 1) {
            if (num == array[x][y]) {
                return true;
            } else if (num < array[x][y]) {
                y--;
            } else {
                x++;
            }
        }

        return false;
    }
}
