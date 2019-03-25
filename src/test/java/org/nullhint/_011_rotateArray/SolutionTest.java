package org.nullhint._011_rotateArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 获取旋转数组的最小数字单元测试。
 */
public class SolutionTest {

    @Test
    public void solve() {
        assertEquals(Solution.solve(null), -1);
        assertEquals(Solution.solve(new int[]{}), -1);
        assertEquals(Solution.solve(new int[]{8}), 8);
        assertEquals(Solution.solve(new int[]{3,4,5,1,2}), 1);
        assertEquals(Solution.solve(new int[]{1,2,3,4,5}), 1);
        assertEquals(Solution.solve(new int[]{1,0,1,1,1}), 0);
        assertEquals(Solution.solve(new int[]{1,1,1,0,1}), 1);
    }
}