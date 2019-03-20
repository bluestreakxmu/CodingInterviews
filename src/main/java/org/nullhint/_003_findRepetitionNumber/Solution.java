package org.nullhint._003_findRepetitionNumber;

/**
 * “找出数组中重复的数字”解法。
 *
 * @author lixibo
 */
public class Solution {

    /**
     * 题目一：找出数组中重复的数字解法。
     * <p>
     * 解题思路：遍历数组，在本数组中不断交换元素值与下标的位置，直到找出重复数字。<br>
     * 空间复杂度为O(1)，时间复杂度为O(n)。
     *
     * @param array 数组
     * @return 重复的数字，-1表示找不到
     */
    public static int solveForQuestion1(int[] array) {
        final int noFoundNumber = -1;

        if (array.length <= 1) {
            return noFoundNumber;
        }

        for (int i = 0; i < array.length; i++) {
            while (i != array[i]) {
                if (array[array[i]] == array[i]) {
                    return array[i];
                }

                int tmp = array[i];
                array[i] = array[array[i]];
                array[tmp] = tmp;
            }
        }

        return noFoundNumber;
    }

    /**
     * 题目二：不修改数组找出重复的数字解法。
     * <p>
     * 解题思路：使用辅助数组，注重时间效率。<br>
     * 时间复杂度O(n)，空间复杂度O(n)。
     *
     * @param array 数组
     * @return 重复的数字，-1表示找不到
     */
    public static int solve1ForQuestion2(int[] array) {
        final int noFoundNumber = -1;

        if (array.length <= 1) {
            return noFoundNumber;
        }

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (newArray[array[i]] == array[i]) {
                return array[i];
            }
            newArray[array[i]] = array[i];
        }

        return noFoundNumber;
    }

    /**
     * 题目二：不修改数组找出重复的数字解法。
     * <p>
     * 解题思路：使用类似二分查找算法，注重空间效率。<br>
     * 时间复杂度O(nlogn)，空间复杂度O(1)。
     *
     * @param array 数组
     * @return 重复的数字，-1表示找不到
     */
    public static int solve2ForQuestion2(int[] array) {
        final int noFoundNumber = -1;

        if (array.length <= 1) {
            return noFoundNumber;
        }


        return noFoundNumber;
    }

}
