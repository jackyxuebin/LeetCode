package main.threeHundred;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by bxue on 1/3/2016.
 */
public class LeetCode332 {

    public List<String> findItinerary(String[][] tickets){
        Map<String,PriorityQueue<String>> iteneraryMap = new HashMap<String,PriorityQueue<String>>();
        List<String> resultArray = new ArrayList<String>();
        for(int i=0; i<tickets.length; i++){
            if(iteneraryMap.containsKey(tickets[i][0])){
                iteneraryMap.get(tickets[i][0]).add(tickets[i][1]);
            }else{
                PriorityQueue tempQueue = new PriorityQueue<String>();
                tempQueue.add(tickets[i][1]);
                iteneraryMap.put(tickets[i][0],tempQueue);
            }
        }
       // System.out.println(iteneraryMap);
        visit("JFK", resultArray, iteneraryMap);

       // System.out.println(resultArray);
        Collections.reverse(resultArray);
        return resultArray;
    }

    private void visit(String node,List resultArray, Map<String,PriorityQueue<String>> iteneraryMap){

       while(iteneraryMap.get(node)!= null && iteneraryMap.get(node).peek()!=null ){
           visit(iteneraryMap.get(node).poll(), resultArray, iteneraryMap);
       }
        resultArray.add(node);

    }
    public static void main(String args[]){
        String[][] tickets={{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        String[][] tickets2={{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        LeetCode332 leetCode332 = new LeetCode332();
        leetCode332.findItinerary(tickets);
    }
}
