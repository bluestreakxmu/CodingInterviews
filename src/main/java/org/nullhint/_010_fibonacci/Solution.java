package org.nullhint._010_fibonacci;

public class Solution {

    /**
     * 求斐波那契数列第n项的值。<br>
     * 时间复杂度：O(n)，空间复杂度：O(1)。
     *
     * @param n 第n项
     * @return 第n项的值
     */
    public static long solve1(int n) {
        if (n <= 1) {
            return n;
        }

        long one = 0;
        long two = 1;
        long next = 1;
        for (int i = 2; i <= n; i++) {
            next = one + two;
            one = two;
            two = next;
        }

        return next;
    }
}
