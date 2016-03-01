/**
 * Created by bxue on 29/2/2016.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.threeHundred.LeetCode334Test;
import test.threeHundred.LeetCode335Test;

public class TestRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(LeetCode334Test.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
