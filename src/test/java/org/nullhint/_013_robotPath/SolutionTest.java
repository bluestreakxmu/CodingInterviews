package org.nullhint._013_robotPath;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 机器人的运动范围单元测试。
 *
 * @author lixibo
 */
public class SolutionTest {

    @Test
    public void solve() {
        assertEquals(Solution.solve(-1, -1, 1), 0);
        assertEquals(Solution.solve(3, 3, 100), 9);
        assertEquals(Solution.solve(9, 9, 15), 80);
    }
}