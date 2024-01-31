package com.placement.dsa.arrays.hard;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] triangle = new int[N][];
        for(int row = 0; row<N; row++){
            int temp[] = new int[row+1];
            for(int col=0;col<=row;col++){
                temp[col] = nCr(row, col);
            }
            triangle[row] = temp;
        }
        return triangle;

    }
    public static int nCr(int n, int r){
        int res = 1;

        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }

}
