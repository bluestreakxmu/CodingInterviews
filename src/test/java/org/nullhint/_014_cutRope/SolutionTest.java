package org.nullhint._014_cutRope;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 剪绳子解法单元测试。
 *
 * @author lixibo
 */
public class SolutionTest {

    @Test
    public void solve1() {
        assertEquals(Solution.solve1(0), 0);
        assertEquals(Solution.solve1(1), 0);
        assertEquals(Solution.solve1(2), 1);
        assertEquals(Solution.solve1(3), 2);
        assertEquals(Solution.solve1(4), 4);
        assertEquals(Solution.solve1(8), 18);
    }

    // @Test
    public void solve2() {
        assertEquals(Solution.solve2(0), 0);
        assertEquals(Solution.solve2(1), 0);
        assertEquals(Solution.solve2(2), 1);
        assertEquals(Solution.solve2(3), 2);
        assertEquals(Solution.solve2(4), 4);
        assertEquals(Solution.solve2(8), 18);
    }
}