package org.nullhint._015_binaryOne;

public class Solution {

    /**
     * 二进制中1的个数解法。<br>
     * 解题思路：不断右移二进制数。<br>
     * 时间复杂度：O(n)，空间复杂度O(1)。
     *
     * @param num 十进制数字
     * @return 二进制数中1的个数。
     */
    public static int solve(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num >>>= 1;
        }

        return count;
    }
}
