package test.threeHundred;

import junit.framework.TestCase;
import main.threeHundred.LeetCode335;
import org.junit.Test;

public class LeetCode335Test extends TestCase {
    int[] x1={2,1,1,2};
    int[] x2={1,2,3,4};
    int[] x3={1,1,1,1};
    LeetCode335 leetCode335 = new LeetCode335();

    @Test
    public void testIsSelfCrossingTest1(){
        assertEquals(true, leetCode335.isSelfCrossing(x1));
    }

    @Test
    public void testIsSelfCrossingTest2(){
        assertEquals(false, leetCode335.isSelfCrossing(x2));
    }

    @Test
    public void testIsSelfCrossingTest3(){
        assertEquals(true,leetCode335.isSelfCrossing(x3));
    }

}