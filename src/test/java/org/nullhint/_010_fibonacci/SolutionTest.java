package org.nullhint._010_fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    /**
     * 斐波那契数列单元测试。
     */
    @Test
    public void solve1() {
        assertEquals(Solution.solve1(0), 0);
        assertEquals(Solution.solve1(1), 1);
        assertEquals(Solution.solve1(2), 1);
        assertEquals(Solution.solve1(3), 2);
        assertEquals(Solution.solve1(12), 144);
    }

    /**
     * 青蛙跳台问题单元测试。
     */
    @Test
    public void solve2() {
        assertEquals(Solution.solve2(0), 0);
        assertEquals(Solution.solve2(1), 1);
        assertEquals(Solution.solve2(2), 2);
        assertEquals(Solution.solve2(3), 3);
        assertEquals(Solution.solve2(11), 144);
    }
}