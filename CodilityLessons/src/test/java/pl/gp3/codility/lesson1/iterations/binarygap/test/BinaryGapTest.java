package pl.gp3.codility.lesson1.iterations.binarygap.test;

import org.junit.Assert;
import org.junit.Test;

import pl.gp3.codility.lesson1.iterations.binarygap.Solution;

public class BinaryGapTest {

    @Test
    public void test1() {
        int n = 1042; // 10000010010B
        int expected = 5;

        testBinaryGaps(n, expected);
    }

    @Test
    public void test2() {
        int n = 15;
        int expected = 0;

        testBinaryGaps(n, expected);
    }

    @Test
    public void test3() {
        int n = 6;
        int expected = 0;

        testBinaryGaps(n, expected);
    }

    @Test
    public void test4() {
        int n = 328;
        int expected = 2;

        testBinaryGaps(n, expected);
    }

    @Test
    public void test5() {
        int n = 1162;
        int expected = 3;

        testBinaryGaps(n, expected);
    }

    @Test
    public void test6() {
        int n = 51712;
        int expected = 2;
        testBinaryGaps(n, expected);
    }

    private void testBinaryGaps(int n, int expected) {
        Assert.assertEquals("n = " + n + " = " + Integer.toBinaryString(n) + "B", expected, new Solution().solution(n));
    }
}
