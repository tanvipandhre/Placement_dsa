package com.placement.dsa.arrays.medium;

import java.util.ArrayList;

public class SetMatrixZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<ArrayList<Integer>> zeroMatrix_brute(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j) == 0){
                    for(int k = 0; k<m;k++){
                        if(matrix.get(i).get(k) == 0) continue;
                        matrix.get(i).set(k, -1);
                    }
                    for(int l = 0; l<n;l++){
                        if(matrix.get(l).get(j) == 0) continue;
                        matrix.get(l).set(j,-1);
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
	
	public static ArrayList<ArrayList<Integer>> zeroMatrix_better(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j) == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( row[i]==1 || col[j]==1){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
	
	
	

}
