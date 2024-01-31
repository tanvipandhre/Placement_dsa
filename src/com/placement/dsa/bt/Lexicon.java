package com.placement.dsa.bt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lexicon {
	
	char[] A; // Array with words separated by null
	int[] T; //Table with indices of keys of A
	int N; // Number of slots
	int count = 1; //count variable kept so that we can adjust the size of T or A as needed
	int end; 
	
	//Create function will create Table T with N slots. A with 15N chars and initializes A to spaces
	public void create(int N) {
		int lengthOfT = count * N;
		int x=0;
		if(lengthOfT == N) { //first time creating T and A
			T = new int[lengthOfT];
			for(int i=0; i<lengthOfT ; i++) {
				T[i] = -1;
			}
			A = new char[15 * lengthOfT];
			for(int i = 0; i < A.length; i++) {
				A[i] = ' ';
			}
		}else { //increasing length of T and A due to collision
			
			char[] copy = new char[A.length];
			for(int i = 0 ;i<A.length ; i++) {
				copy[i] = A[i];
			}
			T = new int[lengthOfT];
			A = new char[15 * lengthOfT];
			for(int j = 0; j < A.length; j++) {
				A[j] = ' ';
			}
			for(int k = 0; k < copy.length ; k++) {
				if(copy[k] != '*' && copy[k] != ' ') {
					A[x] = copy[k];
					x++;
				}else if(copy[k] == '*' && (k+1) < copy.length && copy[k+1] == '\0') {
					k++;
				}
			}
			end = 0;
			for(int i = 0 ;i<A.length ; i++) {
				copy[i] = A[i];
			}
			for(int k = 0; k < T.length; k++) {
				T[k] = -1;
			}
			String a = String.valueOf(copy);
			String[] temp = a.split("\0");
			for(int z = 0; z<temp.length-1 ; z++) {
				insert(temp[z]);
			}
		}
		count = 2; //when create is called again the size of T and A has to get double.
		this.N = lengthOfT;
		
	}
	
	//hashing will return the hashed value of the given word 
	public int hashing(String word) {
		int hash;
		int sumOfAscii=0;
		for(int i=0; i<word.length() ; i++) {
			sumOfAscii += (int) word.charAt(i);
		}
		hash = (sumOfAscii - 4) % N;
		return hash;
		
	}
	//insert function will insert first char of every word to slot t as T[t]
	public void insert(String word) {
		N = T.length;
		int c, col=0;
		String a = String.valueOf(A); //it will return the string representation of A
		int j = a.indexOf(word); // j will the first index of char of the word in A
		for(int i = 0; i < T.length ; i++) {
			if(a.contains(word) && T[i] == j && A[j + word.length()] == '\0') {
				System.out.println(word+ "already exists in A.");
				return;
			}
		}
		int hash = hashing(word);
		
		if(T[hash] != -1) {
			for( int k = 0 ; k < N; k++) {
				int probe = (hash + k * k) % N; //using quadratic probing
				if(T[probe] == -1) {
					hash = probe % N;
					break;
				}
				col++; //incrementing collisions
				
			}
		}
		if((col == T.length && T[hash] != -1) || end+word.length() > A.length) {//checks if collision equals to T's size 
			create(N); 
			insert(word);
		}else { //else insert the word in A
			for(c = 0; c < word.length() ; c++) {
				A[end + c] = word.charAt(c);
			}
			A[end + c] = '\0';
			if(T[hash] == -1) {
				T[hash] = end;
			}
			end = end+c+1;
		}
		
	}
	
	//delete will modify T. It will not erase from A instead replace its characters with a *
	public void delete(String word) {
		int i, index;
		String a = String.valueOf(A); //it will return the string representation of A
		int j = a.indexOf(word); // j will the first index of char of the word in A
		
		for(i = 0; i  < T.length ; i++) {
			if(a.contains(word) && T[i] == j && A[j + word.length()] == '\0') { //if j is present in T and that word is present in A then we can delete from T and replace the characters in A with *
				index = T[i];
				for(int k = index; k < index+word.length() ; k++) {
					A[k] = '*'; //replace the characters in A with *
				}
				
				T[i] = -1; //we can delete from T
				break;
			}
		}
		
		if(i < T.length) {
			System.out.println(word+" deleted from slot "+i);
		}else {
			System.out.println(word+" is not found in Array A. There is nothing to delete.");
		}
			
	}
	
	//print function will print contents of T and A.
	public void print() {
		
		System.out.println("T");
	
		for(int i = 0 ; i < T.length ; i++) {
			if( T[i] == -1) {
				System.out.println(i+":");
			}else {
				System.out.println(i+": "+ T[i]);
			}
		}
		System.out.println();
		System.out.println("A");
		
		for(int j = 0; j < end ; j++) { 
			if( A[j] == '\0') {
				System.out.println("\\");
			}else {
				System.out.println(A[j]);
			}
		}
		System.out.println();
	}
	
	//search function will return string that found at what slot and says not found when string is not present.
	public void search(String word) {
		boolean flag = false;
		int i;
		String a = String.valueOf(A); //it will return the string representation of A
		int j = a.indexOf(word); // j will the first index of char of the word in A
		for( i = 0; i < T.length ; i++) {
			if (a.contains(word)  && T[i] == j && A[j + word.length()] == '\0') {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(word + " found at slot "+ i);
		}else {
			System.out.println(word+" not found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Lexicon lex = new Lexicon();
			int createFirstTime = 0;
			Scanner scan = new Scanner(new File(args[0]));
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] data = line.split(" ");
				switch(data[0]) {
				case "10":
					lex.insert(data[1]);
					break;
				case "11":
					lex.delete(data[1]);
					break;
				case "12":
					lex.search(data[1]);
					break;
				case "13":
					lex.print();
					break;
				case "14":
					if (createFirstTime == 0) {
						createFirstTime++;
						lex.create(Integer.parseInt(data[1]));
					}else {
						continue;
					}
					break;
				}
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
