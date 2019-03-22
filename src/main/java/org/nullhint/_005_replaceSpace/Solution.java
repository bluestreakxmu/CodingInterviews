package org.nullhint._005_replaceSpace;

/**
 * 题目：替换空格解法。
 *
 * @author lixibo
 */
public class Solution {

    /**
     * 替换空格。
     * <p>
     * 解决思路：因为每增加一个空格，就需要多两个字符，所以先遍历一遍字符串，统计出所有空格数，
     * 接着从尾至头遍历，再一次性扩容，移动和替换字符。<br>
     * 时间复杂度：O(2n)，空间复杂度O(1)。
     *
     * @param str 要替换空格的字符串
     * @return 替换空格后的字符串
     */
    public static String solve(String str) {
        if (str == null) {
            return null;
        }

        int spaceNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                spaceNumber++;
            }
        }

        char[] newCharArray = new char[str.length() + 2 * spaceNumber];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                newCharArray[index++] = '%';
                newCharArray[index++] = '2';
                newCharArray[index++] = '0';
            } else {
                newCharArray[index++] = ch;
            }
        }

        return new String(newCharArray);
    }
}
