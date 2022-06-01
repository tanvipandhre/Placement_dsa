package com.placement.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		List<List<String>> queen = solveNQueens(n);
		int i = 1;
		
		for(List<String> it:queen) {
			System.out.println("Arrangement " + i);
			for(String s: it)
				System.out.println(s);
			
			System.out.println();
			i++;
		}

	}
	
	public static List<List<String>> solveNQueens(int n){
		
		char[][] board = new char[n][n];
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n ; j++) {
				board[i][j] = '.';
			}
		}
		
		List<List<String>> res = new ArrayList<>();
		dfs(0, board, res);
		return res;
		
	} 
	
	//recursive function for each column
	public static void dfs(int col, char[][] board, List<List<String>> res) {
		if(col == board.length) {
			res.add(construct(board));
			return;
		}
		
		for(int row = 0; row<board.length ; row++) {
			if(validate(board, row, col)) {
				board[row][col] = 'Q';
				dfs(col+1, board, res);
				board[row][col] = '.';
			}
		}
	}
	
	//constructs a board's row into a string and then add that string to a list
	public static List<String> construct(char[][] board){
		List<String> res = new ArrayList<>();
		for(int i=0; i<board.length; i++) {
			String s = new String(board[i]);
			res.add(s);
		}
			
		return res;
	}
	
	public static boolean validate(char[][] board, int row, int col) {
		int dupRow = row;
		int dupCol = col;
		
		//north west
		while(row>=0 && col>=0) {
			if(board[row][col] == 'Q')
				return false;
			row--;
			col--;
		}
		
		//west
		row = dupRow;
		col = dupCol;
		while(col >= 0) {
			if(board[row][col] == 'Q')
				return false;
			col--;
		}
		
		//south west
		row = dupRow;
		col = dupCol;
		while(col >= 0 && row<board.length) {
			if(board[row][col] == 'Q')
				return false;
			col--;
			row++;
		}
		
		return true;
	}

}
