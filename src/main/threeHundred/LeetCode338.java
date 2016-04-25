package main.threeHundred;

/**
 * Created by bxue on 18/3/2016.
 */
public class LeetCode338 {
    public int[] countBits(int num) {
        int[] resultset = new int[num+1];
        int divider=2;
        for(int i=0; i<=num ;i++){
            if(i==divider*2){
                divider*=2;
            }
            if(i==0){
                resultset[i]=0;
            }
            if(i==1){
                resultset[i]=1;
            }
            if(i>1) {
                resultset[i] = resultset[i % divider] + 1;
            }
        }
        return resultset;
    }

    public static void main(String args[]){
        LeetCode338 leetCode338 = new LeetCode338();
        System.out.println(leetCode338.countBits(5));
    }
}
