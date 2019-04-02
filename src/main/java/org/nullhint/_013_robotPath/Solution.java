package org.nullhint._013_robotPath;

public class Solution {

    /**
     * 机器人的运动范围解法。
     * <p>
     * 解题思路：使用回溯法解题（类似上一题）。<br>
     * 时间复杂度O(n)，空间复杂度O(n)。
     *
     * @param rowCount    行数
     * @param columnCount 列表
     * @param maxNum      数位之和最大值
     * @return 能够到达的格子总数
     */
    public static int solve(int rowCount, int columnCount, int maxNum) {
        if (rowCount <= 0 || columnCount <= 0) {
            return 0;
        }

        return recursiveCount(0, 0, rowCount - 1, columnCount - 1, maxNum, new boolean[rowCount][columnCount]);
    }

    /**
     * 递归计数。
     *
     * @param x         当前x轴坐标
     * @param y         当前y轴坐标
     * @param maxX      最大允许的x轴坐标
     * @param maxY      最大允许的y轴坐标
     * @param maxNum    最大允许的数位和
     * @param passArray 记录已经统计过的坐标
     * @return 能到达的格子数
     */
    private static int recursiveCount(int x, int y, int maxX, int maxY, int maxNum, boolean[][] passArray) {
        if (x < 0 || y < 0 || x > maxX || y > maxY) {
            return 0;
        }

        if (passArray[x][y]) {
            return 0;
        }

        passArray[x][y] = true;

        if (match(x, y, maxNum)) {
            return recursiveCount(x, y - 1, maxX, maxY, maxNum, passArray)
                    + recursiveCount(x + 1, y, maxX, maxY, maxNum, passArray)
                    + recursiveCount(x, y + 1, maxX, maxY, maxNum, passArray)
                    + recursiveCount(x - 1, y, maxX, maxY, maxNum, passArray)
                    + 1;
        }

        return 0;
    }

    /**
     * 判断坐标(x, y)的数位和是否在阈值范围内。
     *
     * @param x         x轴坐标
     * @param y         y轴坐标
     * @param threshold 阈值
     * @return true-在阈值范围内，false-不在阈值范围内
     */
    private static boolean match(int x, int y, int threshold) {
        return (getDigitalCount(x) + getDigitalCount(y)) <= threshold;
    }

    /**
     * 获取数位和。
     *
     * @param n 数值
     * @return 数位和
     */
    private static int getDigitalCount(int n) {
        int count = 0;

        while (n > 0) {
            count += (n % 10);
            n /= 10;
        }
        return count;
    }
}
