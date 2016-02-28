package main.threeHundred;

/**
 * Created by Xue Bin on 2016/2/28.
 */
public class LeetCode335 {
    public static void main(String[] args){
      int[] x={2,1,4,4,3,3,2,1,1};
        LeetCode335 leetCode335 = new LeetCode335();
        System.out.println(leetCode335.isSelfCrossing(x));
    }

    public boolean isSelfCrossing(int[] x) {
        if(x.length<4){
            return false;
        }
        int pointer=3;
        int pre1=x[pointer - 1];
        int pre2=x[pointer - 2];
        int pre3=x[pointer-3];
        int pre4=0;
        int pre5=0;
        int cur = x[pointer];
        while(pre1 > pre3 && pointer<x.length-1) {
            pointer++;
            cur = x[pointer];
            pre1 = x[pointer - 1];
            pre2 = x[pointer - 2];
            pre3 = x[pointer - 3];
            if (pointer - 4 >= 0) {
                pre4 = x[pointer - 4];
            }
            if (pointer - 5 >= 0) {
                pre5 = x[pointer - 5];
            }
        }
        if(pre1<=pre3){
            if(cur >= pre2){//loop ended with pre3<=pre1
                return true;
            }else{
               // System.out.println("cur:"+cur+"pre1:"+pre1+"pre2:"+pre2+"pre3:"+pre3+"pre4:"+pre4+"pre5:"+pre5);
                if(pre1>=(pre3-pre5)){
                    if(cur >= pre2-pre4){
                        return true;
                    }
                }
                if(pointer == x.length-1){
                    return false;
                }
                pointer++;
                cur = x[pointer];
                pre2 = x[pointer - 2];
                while (cur < pre2 && pointer < x.length - 1) {
                    pointer++;
                    cur = x[pointer];
                    pre2 = x[pointer - 2];
                }
                if (cur >= pre2) {
                    return true;
                }
            }
        }else {
            return false;
        }
        return false;
    }
}
