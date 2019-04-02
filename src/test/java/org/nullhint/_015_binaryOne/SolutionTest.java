package org.nullhint._015_binaryOne;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 题目：二进制中1的个数单元测试。
 */
public class SolutionTest {

    @Test
    public void solve() {
        assertEquals(Solution.solve(0), 0);
        assertEquals(Solution.solve(1), 1);
        assertEquals(Solution.solve(8), 1);
        assertEquals(Solution.solve(9), 2);
        assertEquals(Solution.solve(-1), 32);
        assertEquals(Solution.solve(Integer.MAX_VALUE), 31);
        assertEquals(Solution.solve(Integer.MIN_VALUE), 1);
    }
}