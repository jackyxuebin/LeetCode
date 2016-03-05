package main.threeHundred;

import java.util.*;

/**
 * Created by Xue Bin on 2016/3/5.
 */
public class LeetCode330 {
    public int minPatches(int[] nums, int n) {
        List<Integer> patchList = new ArrayList<Integer>();
        while(findLeastMissingSum(nums,n,patchList)!=null){
            Integer leastMissingSum = findLeastMissingSum(nums, n, patchList);
            //System.out.println(leastMissingSum);
            if(leastMissingSum != null) {
                patchList.add(leastMissingSum);
            }
        }
        System.out.println(patchList);
        return patchList.size();
    }


    private Integer findLeastMissingSum(int[] nums, int index, List<Integer> patchList){
        //combine patch and original array

        List<Integer> combinedList = new ArrayList<Integer>();
       /* combinedList.addAll(patchList);
        for(int i=0;i<nums.length;i++){
            combinedList.add(nums[i]);
        }
        Collections.sort(combinedList);*/
        int arrayIndex=0;
        int patchListIndex=0;

        if(nums.length==0){
            combinedList.addAll(patchList);
        }
        else if(patchList.isEmpty()){
           for(int i=0; i<nums.length;i++){
               combinedList.add(nums[i]);
           }
        }else {
            while (arrayIndex < nums.length && patchListIndex < patchList.size()) {
                if (patchList.get(patchListIndex) > nums[arrayIndex]) {
                    combinedList.add(nums[arrayIndex]);
                    arrayIndex++;
                } else {
                    combinedList.add(patchList.get(patchListIndex));
                    patchListIndex++;
                }
            }
            for(int i= arrayIndex ; i<nums.length;i++){
                    combinedList.add(nums[i]);

            }
            for(int i=patchListIndex; i<patchList.size();i++){
                combinedList.add(patchList.get(i));
            }

        }

        if(combinedList.isEmpty() || combinedList.get(0)>1){
            return 1;
        }
        int leastMissingSum=2;
        for (int i = 1; i < combinedList.size(); i++) {
            int temp = combinedList.get(i);
            if(temp > leastMissingSum){
                return leastMissingSum;
            }else{
                leastMissingSum = temp+leastMissingSum;
                if(leastMissingSum>index){
                    return null;
                }
            }
        }
       // System.out.println("least missing sum is "+leastMissingSum+"index is "+index);
        if(index<leastMissingSum || leastMissingSum <0) {
            return null;
        }else{
            return leastMissingSum;
        }

    }

    public static void main(String args[]){
        LeetCode330 leetCode330= new LeetCode330();
        int[] x1={1,2,31,33};


        int n1=2147483647;
        System.out.print("output:"+leetCode330.minPatches(x1, n1));
    }


}
