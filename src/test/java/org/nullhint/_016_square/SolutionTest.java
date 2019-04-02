package org.nullhint._016_square;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void power1() {
        assertEquals(Solution.power1(0, 0), 0, 0);
        assertEquals(Solution.power1(1, 0), 1, 0);
        assertEquals(Solution.power1(2, 4), 16, 0);
        assertEquals(Solution.power1(-2, 4), 1.0/16, 0);
    }

    @Test
    public void power2() {
    }
}