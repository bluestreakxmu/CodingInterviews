package org.nullhint._003_findRepetitionNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * “找出数组中重复的数字”单元测试。
 *
 * @author lixibo
 */
public class SolutionTest {

    @Test
    public void solveForQuestion1() {
        // assert null
        int[] array = {};
        assertEquals(Solution.solveForQuestion1(array), -1);
        // assert repeat number
        array = new int[]{2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = Solution.solveForQuestion1(array);
        assertTrue(repeatNumber == 2 || repeatNumber == 3);
        // assert no repeat number
        array = new int[]{2, 3, 1, 0, 4, 5, 6};
        assertEquals(Solution.solveForQuestion1(array), -1);
    }

    @Test
    public void solve1ForQuestion2() {
        int[] array = {2, 3, 5, 4, 3, 2, 6, 7};
        int repeatNumber = Solution.solve1ForQuestion2(array);
        assertTrue(repeatNumber == 2 || repeatNumber == 3);
    }

    @Test
    public void solve2ForQuestion2() {
        int[] array = {2, 3, 5, 4, 3, 2, 6, 7};
        int repeatNumber = Solution.solve2ForQuestion2(array);
        assertTrue(repeatNumber == 2 || repeatNumber == 3);
    }
}