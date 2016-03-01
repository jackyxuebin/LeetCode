package test.threeHundred;

import org.junit.Test;

import main.threeHundred.LeetCode334;

import static org.junit.Assert.assertEquals;

/**
 * Created by bxue on 29/2/2016.
 */
public class LeetCode334Test {
    int[] x1={1,2,3,4,5};
    int[] x2={5,4,3,2,1};
    int[] x3={1,2,2,3,1};
    int[] x4={4,3,4,5,6};
    int[] x5={2,1,5,0,4,6};
    int[] x6={1,2,3,1,2,1};
    int[] x7={5,1,5,5,2,5,4};
    int[] x8={2,4,-2,-3};
    int[] x9={1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    int[] x10={1,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,10000};
    LeetCode334 leetCode334 = new LeetCode334();

     @Test
    public void increasingTripletTest1(){
         assertEquals(true, leetCode334.increasingTriplet(x1));
     }

    @Test
    public void increasingTripletTest2(){
        assertEquals(false,leetCode334.increasingTriplet(x2));
    }

    @Test
    public void increasingTripletTest3(){
        assertEquals(true,leetCode334.increasingTriplet(x3));
    }

    @Test
    public void increasingTripletTest4(){
        assertEquals(true,leetCode334.increasingTriplet(x4));
    }
    @Test
    public void increasingTripletTest5(){
        assertEquals(true,leetCode334.increasingTriplet(x5));
    }

    @Test
    public void increasingTripletTest6(){
        assertEquals(true,leetCode334.increasingTriplet(x6));
    }

    @Test
    public void increasingTripletTest7(){
        assertEquals(true,leetCode334.increasingTriplet(x7));
    }

    @Test
    public void increasingTripletTest8(){
        assertEquals(false,leetCode334.increasingTriplet(x8));
    }

    @Test
    public void increasingTripletTest9(){
        assertEquals(false,leetCode334.increasingTriplet(x9));
    }

    @Test
    public void increasingTripletTest10(){
        assertEquals(true,leetCode334.increasingTriplet(x10));
    }
}
