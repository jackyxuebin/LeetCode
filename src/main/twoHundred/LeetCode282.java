package main.twoHundred;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bxue on 18/4/2016.
 */
public class LeetCode282 {
    public List<String> addOperators(String num, int target){
        List<String> outputList = new ArrayList<String>();
        List<String> removeList = new ArrayList<String>();
        addOperator(outputList, num, 0);

        for(String s : outputList){
            Long i = evaluate(s);
            //System.out.println(i);
            //System.out.println(s);
            if(i!=target){
                removeList.add(s);
            }
        }
        outputList.removeAll(removeList);
        removeList.clear();
        Pattern pattern = Pattern.compile("^.*0+\\d+.*$");
        for(String s : outputList){
           Matcher matcher = pattern.matcher(s);
            if(matcher.find()) {
                removeList.add(s);
            }
        }
        outputList.removeAll(removeList);
        return outputList;
    }
    public void addOperator(List<String> completeList,String num,int pos){
        if(pos==num.length()-1){
            completeList.add(num);
            return;
        }else{
            addOperator(completeList, num.substring(0, pos + 1) + "+" + num.substring(pos + 1, num.length()), pos + 2);
            addOperator(completeList, num.substring(0, pos + 1) + "-" + num.substring(pos + 1, num.length()), pos + 2);
            addOperator(completeList, num.substring(0, pos + 1) + "*" + num.substring(pos + 1, num.length()), pos + 2);
            addOperator(completeList, num.substring(0, pos + 1) + "" + num.substring(pos + 1, num.length()), pos + 1);

        }
    }

    public Long evaluate(String expression){
        Stack<Long> numStack = new Stack<Long>();
        Stack<String> operatorStack = new Stack<String>();
        String num = "";
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);

            if(c>='0' && c<='9'){
                num+=c;
                if(i==expression.length()-1){
                    numStack.push(Long.parseLong(num));
                }
            }else{//an operator found

                numStack.push(Long.parseLong(num));
                num="";
                if(!operatorStack.isEmpty() && operatorStack.peek().equals("*")){
                    Long num1 = numStack.pop();
                    Long num2= numStack.pop();
                    numStack.push(num1*num2);
                    operatorStack.pop();
                }
                operatorStack.push(c+"");
            }

        }
        if(!operatorStack.isEmpty() && operatorStack.peek().equals("*")){
            Long num1 = numStack.pop();
            Long num2= numStack.pop();
            numStack.push(num1*num2);
            operatorStack.pop();
        }
        Stack<Long> reverseNumStack = new Stack<Long>();
        Stack<String> reverseOperatorStack = new Stack<String>();
        while(!numStack.isEmpty()){
            reverseNumStack.push(numStack.pop());
        }
        while(!operatorStack.isEmpty()){
            reverseOperatorStack.push(operatorStack.pop());
        }
        while(!reverseOperatorStack.isEmpty()){
           // System.out.println(numStack);
           // System.out.println(operatorStack);
            String operator = reverseOperatorStack.pop();
          //  System.out.println(operator);
            Long num1 = reverseNumStack.pop();
            Long num2 = reverseNumStack.pop();
            if(operator.equals("+")) {
                reverseNumStack.push(num1 + num2);
            }else if(operator.equals("-")){
                reverseNumStack.push(num1-num2);
            }
            System.out.println(reverseNumStack);
        }
        System.out.println(reverseNumStack.peek());
        return reverseNumStack.pop();
    }
    public static void main(String args[]){
        LeetCode282 leetCode282 = new LeetCode282();
        List<String> output = new ArrayList<String>();
        leetCode282.addOperator(output, "3456237490", 0);
        System.out.println(output.size());
        System.out.println(leetCode282.addOperators("3456237490", 9191));
        Pattern pattern = Pattern.compile("^.*0+\\d+.*$");
        Matcher matcher = pattern.matcher("1*05");
        System.out.println(matcher.find());
    }

}
