package org.nullhint._010_fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solve1() {
        assertEquals(Solution.solve1(0), 0);
        assertEquals(Solution.solve1(1), 1);
        assertEquals(Solution.solve1(2), 1);
        assertEquals(Solution.solve1(3), 2);
        assertEquals(Solution.solve1(12), 144);
    }
}