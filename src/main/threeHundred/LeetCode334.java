package main.threeHundred;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bxue on 29/2/2016.
 */
public class LeetCode334 {
    public boolean increasingTriplet(int[] nums) {
       int[] leftmin = new int[nums.length];
        int leftminIndex=0;
        int[] rightmax= new int[nums.length];
        int rightmaxIndex=nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<nums[leftminIndex]){
                leftminIndex=i;
            }
            leftmin[i]=leftminIndex;
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[rightmaxIndex]){
                rightmaxIndex=i;
            }
            rightmax[i]=rightmaxIndex;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[leftmin[i]] && nums[i]<nums[rightmax[i]]){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[] x={1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        LeetCode334 leetCode334 = new LeetCode334();
        leetCode334.increasingTriplet(x);
    }

}
