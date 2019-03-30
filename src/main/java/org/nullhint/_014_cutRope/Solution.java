package org.nullhint._014_cutRope;

public class Solution {

    /**
     * 剪绳子解法。<p>
     * 解题思路：使用动态规划。<br>
     * 时间复杂度O(n^2)，空间复杂度O(n)。
     *
     * @param length 绳子长度
     * @return 最大乘积
     */
    public static int solve1(int length) {
        if (length <= 1) {
            return 0;
        } else if (length == 2) {
            return 1;
        } else if (length == 3) {
            return 2;
        }

        int[] array = new int[length + 1];
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        for (int i = 4; i <= length; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int tmp = array[j] * array[i - j];
                if (max < tmp) {
                    max = tmp;
                }
            }
            array[i] = max;
        }

        return array[length];
    }

    /**
     * 剪绳子解法。<p>
     * 解题思路：使用贪心算法，但是需要一定的数学技巧，暂忽略。<br>
     * 时间复杂度O(1)，空间复杂度O(1)。
     *
     * @param length 绳子长度
     * @return 最大乘积
     */
    public static int solve2(int length) {
        return -1;

    }

}
