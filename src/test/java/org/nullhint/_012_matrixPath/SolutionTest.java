package org.nullhint._012_matrixPath;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 判断矩阵中是否存在某个字符串所有字符的路径单元测试。
 *
 * @author lixibo
 */
public class SolutionTest {

    @Test
    public void solve() {
        assertFalse(Solution.solve(new char[][]{}, null));
        assertFalse(Solution.solve(new char[][]{}, ""));
        assertTrue(Solution.solve(new char[][]{
                {'a', 'b', 't', 'g'},
                {'c', 'f', 'c', 's'},
                {'j', 'd', 'e', 'h'}}, "bfce"));
        assertFalse(Solution.solve(new char[][]{
                {'a', 'b', 't', 'g'},
                {'c', 'f', 'c', 's'},
                {'j', 'd', 'e', 'h'}}, "abfb"));
        assertTrue(Solution.solve(new char[][]{
                {'a', 'b', 't', 'g'}}, "btg"));
        assertFalse(Solution.solve(new char[][]{
                {'a', 'b', 't', 'g'}}, "abgt"));
        assertTrue(Solution.solve(new char[][]{
                {'a'},
                {'c'},
                {'j'},
                {'k'}}, "cjk"));
        assertFalse(Solution.solve(new char[][]{
                {'a'},
                {'c'},
                {'j'},
                {'k'}}, "ackj"));
        assertTrue(Solution.solve(new char[][]{
                {'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a'}}, "aaaa"));
    }
}