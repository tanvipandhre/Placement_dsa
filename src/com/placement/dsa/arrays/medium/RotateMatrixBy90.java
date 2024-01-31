package com.placement.dsa.arrays.medium;

public class RotateMatrixBy90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//make a new matrix
	public static void rotateMatrix_brute(int [][]mat){
        // Write your code here.
        int nr = mat.length;
        int nc = mat[0].length;
        int[][] ans = new int[nc][nr];
        for(int i = 0; i<nr;i++){
            for(int j=0;j<nc; j++){
                ans[j][nr-i-1] = mat[i][j];
            }
        }
        for(int i=0;i<nc;i++){
            for(int j=0;j<nr;j++){
                mat[i][j] =ans[i][j];
            }
        }
        
    }

}
