package test.threeHundred;

import org.junit.Test;

import main.threeHundred.LeetCode338;

import static org.junit.Assert.assertEquals;

/**
 * Created by bxue on 18/3/2016.
 */
public class LeetCode338Test {
    LeetCode338 leetCode338 = new LeetCode338();
    int num1=5;

    @Test
    public void countBitsTest1(){
        assertEquals(new int[]{1, 1, 1, 2, 1, 2}, leetCode338.countBits(5));
    }

}
