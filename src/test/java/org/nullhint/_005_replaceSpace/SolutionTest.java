package org.nullhint._005_replaceSpace;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * 替换空格单元测试。
 *
 * @author lixibo
 */
public class SolutionTest {

    @Test
    public void solve() {
        assertNull(Solution.solve(null));
        assertEquals(Solution.solve(""), "");
        assertEquals(Solution.solve("We are happy."), "We%20are%20happy.");
        assertEquals(Solution.solve("WeAreHappy."), "WeAreHappy.");
        assertEquals(Solution.solve("  We are happy.  "), "%20%20We%20are%20happy.%20%20");
        assertEquals(Solution.solve(" "), "%20");
        assertEquals(Solution.solve("   "), "%20%20%20");
    }
}