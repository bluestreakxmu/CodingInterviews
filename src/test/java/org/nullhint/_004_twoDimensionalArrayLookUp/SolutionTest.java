package org.nullhint._004_twoDimensionalArrayLookUp;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * “题目：二维数组中的查找”解法单元测试。
 *
 * @author lixibo
 */
public class SolutionTest {

    @Test
    public void solve() {
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        // test true
        assertTrue(Solution.solve(array, 1));
        assertTrue(Solution.solve(array, 7));
        assertTrue(Solution.solve(array, 15));
        // test false
        assertFalse(Solution.solve(array, 19));
        assertFalse(Solution.solve(array, -1));
        assertFalse(Solution.solve(array, 5));
        // test null
        assertFalse(Solution.solve(null, 1));
    }
}