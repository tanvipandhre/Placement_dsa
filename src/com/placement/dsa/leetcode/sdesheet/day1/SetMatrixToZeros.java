package com.placement.dsa.leetcode.sdesheet.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

 */
public class SetMatrixToZeros {
	//my solution
	 public void setZeroes(int[][] matrix) {
	        List<Integer> row = new ArrayList<Integer>();
	        List<Integer> col = new ArrayList<Integer>();
	        int rows =  matrix.length;
	        int cols = matrix[0].length;
	        Map<Integer, List<Integer>> rowMap = new HashMap<Integer,List<Integer>>();
	        for(int i = 0 ; i < rows; i++){
	           // List<Integer> list = new ArrayList<Integer>();
	            for(int j = 0; j< cols; j++){
	                if(matrix[i][j] == 0){
	                    row.add(i);
	                    col.add(j);

	                }

	            }
	        }
	        for(int r = 0; r< row.size(); r++ ){
	            for(int cc = 0; cc<cols; cc++){
	                matrix[row.get(r)][cc] = 0;
	            }
	        }
	         for(int c = 0; c< col.size(); c++ ){
	            for(int rr = 0; rr < rows; rr++){
	                matrix[rr][col.get(c)]= 0;
	            }
	        }
	        
	    }
	 
	 //striver brute force 
	 //traversing whole matrix and then finding 0   
	 //if we get a 0 then traversing its row and colum and conversing +ve numbers to -1
	 //Time complexity O(mxn) + O(m+n)
	 //Space complexity O(1)
	 
	 //optimal solution 
	 //constructing 2 dummy arrays and traversing 
	 // Time complexity - if its 0 then make 0 for that dummy array o(mxn + mxn) 
	 // space complexity for each dummy array - O(m) + O(n)
	 
	 
	 
}
