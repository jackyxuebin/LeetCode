package test.threeHundred;

import main.threeHundred.LeetCode331;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Xue Bin on 2016/3/4.
 */
public class LeetCode331Test {
    LeetCode331 leetCode331 = new LeetCode331();
    String x1="9,3,4,#,#,1,#,#,2,#,6,#,#";
    String x2="1,#";
    String x3="9,#,#,1";

    @Test
    public void isValidSerializationTest1(){
        assertTrue(leetCode331.isValidSerialization(x1));
    }

    @Test
    public void isValidSerializationTest2(){
        assertFalse(leetCode331.isValidSerialization(x2));
    }

    @Test
    public void isValidSerializationTest3(){
        assertFalse(leetCode331.isValidSerialization(x3));
    }
}
