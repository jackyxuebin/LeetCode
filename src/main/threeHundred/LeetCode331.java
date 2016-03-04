package main.threeHundred;

import java.util.Stack;

/**
 * Created by Xue Bin on 2016/3/4.
 */
public class LeetCode331 {

    public boolean isValidSerialization(String preorder) {
        String[] splittedString = preorder.split(",");
        Stack<String> treeStack = new Stack<String>();
        for(int i=0;i<splittedString.length;i++){
            if(!treeStack.isEmpty() && treeStack.firstElement().equals("#")){
                return false;
            }
           treeStack.add(splittedString[i]);
            int numOfHash=0;
           // System.out.println(treeStack);
            while(!treeStack.isEmpty() && treeStack.peek().equals("#")){
                treeStack.pop();
                numOfHash++;
                if(numOfHash==2){
                    String temp=treeStack.pop();
                    if(temp.equals("#")){
                        return false;
                    }else {
                        treeStack.push("#");
                        numOfHash=0;
                    }

                }
            }
           if(numOfHash==1){
               treeStack.push("#");
           }

        }
        if(treeStack.size()==1 && treeStack.peek().equals("#")){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String args[]){
        LeetCode331 leetCode331 = new LeetCode331();
        String x="9,3,4,#,#,1,#,#,2,#,6,#,#";
        System.out.println(leetCode331.isValidSerialization(x));
    }
}
