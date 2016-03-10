package main.threeHundred;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bxue on 8/3/2016.
 */
public class LeetCode329 {

    public static void main(String args[]){
        LeetCode329 leetCode329 = new LeetCode329();
        int[][] nums1={};
        System.out.println(leetCode329.longestIncreasingPath(nums1));
    }
    public int longestIncreasingPath(int[][] matrix){
        if(matrix.length==0)
            return 0;
        int[][] longestPathMatrix = new int[matrix.length][matrix[0].length];
        int longestIncreasingPath = 1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                int tempLongestPath = longestIncreasingPathHelper(matrix,longestPathMatrix,i,j);
                longestPathMatrix[i][j]=tempLongestPath;
                if(tempLongestPath>longestIncreasingPath){
                    longestIncreasingPath=tempLongestPath;
                }
            }
        }
        return longestIncreasingPath;
    }


    private int longestIncreasingPathHelper(int[][] matrix,int[][]longestPathMatrix, int x, int y){
        List<Point> pathList = getPathList(matrix,x,y);
        if(pathList.isEmpty()){
            longestPathMatrix[x][y]=1;
            return 1;
        }
       int max=0;
        for(Point point : pathList){
            int tempPathLength=longestPathMatrix[point.x][point.y];
            if(tempPathLength==0) {
                tempPathLength = longestIncreasingPathHelper(matrix, longestPathMatrix, point.x, point.y);
            }
            if(tempPathLength>max){
                max=tempPathLength;
            }
        }
        longestPathMatrix[x][y]=1+max;
        return 1+max;

    }
    private List<Point> getPathList(int[][] matrix, int x, int y){
        List<Point> pathList = new ArrayList<Point>();

        Point neighbour1 = new Point(x+1,y);
        if(x+1<matrix.length) {
            if(matrix[x+1][y]>matrix[x][y])
                pathList.add(neighbour1);
        }

        Point neighbour2 = new Point(x-1,y);
        if(x-1>=0) {
            if(matrix[x-1][y]>matrix[x][y])
                pathList.add(neighbour2);
        }

        Point neighbour3 = new Point(x,y+1);
        if(y+1<matrix[0].length) {
            if(matrix[x][y+1]>matrix[x][y]) {
                pathList.add(neighbour3);
            }
        }

        Point neighbour4 = new Point(x,y-1);
        if(y-1>=0) {
            if(matrix[x][y-1]>matrix[x][y])
                pathList.add(neighbour4);
        }
        return pathList;


    }

}
