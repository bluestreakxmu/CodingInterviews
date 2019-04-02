package org.nullhint._016_square;

public class Solution {

    /**
     * 求数值的整数次方。<br>
     * 解题思路：注意次方<=0的情况（使用常规解法）。
     *
     * @param base     数值
     * @param exponent 次方
     * @return 数值的整数次方
     */
    public static double power1(double base, int exponent) {
        if (exponent == 0) {
            if (base == 0.0) {
                return 0;
            } else {
                return 1;
            }
        }

        int flag = 1;
        if (exponent < 0) {
            flag = -1;
        }

        for (int i = 0; i < exponent * flag; i++) {
            base *= (exponent * flag);
        }

        if (flag < 0) {
            base = 1 / base;
        }

        return base;
    }

    /**
     * 求数值的整数次方。<br>
     * 解题思路：注意次方<=0的情况（使用一些技巧提高效率）。
     *
     * @param base     数值
     * @param exponent 次方
     * @return 数值的整数次方
     */
    public static double power2(double base, int exponent) {
        return 0;
    }

}
