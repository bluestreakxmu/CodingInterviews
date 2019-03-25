package org.nullhint._011_rotateArray;

public class Solution {

    /**
     * 题目：获取旋转数组的最小数字。
     * <p>
     * 解题思路：
     * <p>
     * 时间复杂度O()，空间复杂度O()。
     *
     * @param array 旋转后的数组
     * @return 旋转数组的最小数字
     */
    public static int solve(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int first = 0;
        int last = array.length - 1;
        int min;

        if (array[first] == array[last]) {
            min = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        } else if (array[first] < array[last]) {
            min = array[first];
        } else {
            int mid = (first + last) / 2;
            while (first < mid && mid < last) {
                if (array[first] <= array[mid]) {
                    first = mid;
                } else {
                    last = mid;
                }
                mid = (first + last) / 2;
            }
            min = array[first];
            if (min > array[last]) {
                min = array[last];
            }
        }

        return min;
    }
}
