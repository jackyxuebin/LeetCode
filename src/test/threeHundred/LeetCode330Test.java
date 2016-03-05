package test.threeHundred;

import main.threeHundred.LeetCode330;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Xue Bin on 2016/3/5.
 */
public class LeetCode330Test {
    LeetCode330 leetCode330 = new LeetCode330();
    int[] x1={1,3};
    int n1=6;
    int[] x2={1,5,10};
    int n2=20;
    int[] x3={1,2,2};
    int n3=5;

    @Test
    public void  minPatchersTest1(){
        assertEquals(1,leetCode330.minPatches(x1,n1));
    }

    @Test
    public void minPatchersTest2(){
        assertEquals(2,leetCode330.minPatches(x2,n2));
    }

    @Test
    public void minPatchersTest3(){
        assertEquals(0,leetCode330.minPatches(x3,n3));
    }
}
