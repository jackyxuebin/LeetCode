package test.threeHundred;

import org.junit.Test;

import main.threeHundred.LeetCode329;

import static org.junit.Assert.assertEquals;

/**
 * Created by bxue on 8/3/2016.
 */
public class LeetCode329Test {
    LeetCode329 leetCode329 = new LeetCode329();
    int[][] nums1={{9,9,4},
                    {6,6,8},
                    {2,1,1}};
    int[][] nums2={{3,4,5},
                    {3,2,6},
                    {2,2,1}};
    int [][] nums3={};

    @Test
    public void longestIncreasingPathTest1(){
        assertEquals(4,leetCode329.longestIncreasingPath(nums1));
    }

    @Test
    public void longestIncreasingPathTest2(){
        assertEquals(4,leetCode329.longestIncreasingPath(nums2));
    }

    @Test
    public void longestIncreasingPathTest3(){
        assertEquals(0,leetCode329.longestIncreasingPath(nums3));
    }
}
