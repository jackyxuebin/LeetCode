package test.threeHundred;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import main.threeHundred.LeetCode332;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by bxue on 1/3/2016.
 */
public class LeetCode332Test {
    LeetCode332 leetCode332 = new LeetCode332();
    String[][] tickets1= {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
    String[][] tickets2={{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};

    @Test
    public void findItineraryTest1(){
        List expectedResult = new ArrayList<String>();
        expectedResult.add("JFK");
        expectedResult.add("MUC");
        expectedResult.add("LHR");
        expectedResult.add("SFO");
        expectedResult.add("SJC");
       assertEquals(expectedResult,leetCode332.findItinerary(tickets1));
    }

    @Test
    public void findItineraryTest2(){
        List expectedResult = new ArrayList<String>();
        expectedResult.add("JFK");
        expectedResult.add("ATL");
        expectedResult.add("JFK");
        expectedResult.add("SFO");
        expectedResult.add("ATL");
        expectedResult.add("SFO");
        assertEquals(expectedResult, leetCode332.findItinerary(tickets2));
    }
}
