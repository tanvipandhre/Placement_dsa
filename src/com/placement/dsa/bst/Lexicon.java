package com.placement.dsa.bst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Lexicon {
	
	private int slots;
    private int[] T;
    private char[] A;
    private int lengthOfA;
    private int indexOfA;
    private int maxLoopToInsert;
    private int occupied;

    Lexicon(int slots){
        this.slots = slots;
        this.T = new int[slots];
        Arrays.fill(T, -1);
        this.A = new char[slots];
        this.lengthOfA = slots;
        this.indexOfA = 0;
        this.maxLoopToInsert = slots;
        this.occupied = 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = args[0];
	    HashBatch hashBatch = new HashBatch(filename);
	    hashBatch.Batch();

	}
	public boolean isEmpty() {
	    return this.occupied == 0;
	}

	public boolean isFull() {
	    return this.occupied >= this.slots;
	}
	
	int Search(String word) {
	    for (int i = 0; i < this.maxLoopToInsert; i++) {
	        int index = this.hashing(i, 	sumAsciiMinusFour(word));
	        int Tindex = this.T[index];
	        switch (Tindex) {
	            // reached blank
	            case -1:
	                return -1;
	            
	            // previously deleted entry
	            case -2:
	                break;
	            
	            // found a spot to put it in
	            default:
	                String guess = this.wordInA(Tindex);
	                if (word.compareTo(guess) == 0) {
	                    return index;
	                } else if (guess.compareTo("") == 0 || guess.charAt(0) == '*') {
	                    return -1;
	                }
	                break;
	        }
	    }
	    return -1;
	}

	String Print() {
	    String rtn = " T\t\t\tA: ";
	    for(int i=0; i<this.indexOfA; i++) {
	        if(A[i] == '\0') {
	            rtn += "\\";
	        } else {
	            rtn += this.A[i];
	        }
	    }
	    rtn += "\n";
	    for(int i = 0; i < this.slots; i++) {
	        rtn += Integer.toString(i) + ": ";
	        rtn += this.T[i] >= 0 ? Integer.toString(this.T[i]) : "";
	        rtn += "\n";
	    }
	    return rtn;
	}
	
	public int sumAsciiMinusFour(String word) {
	    int sumMinusFour = 0;
	    for(int i = 0; i < word.length(); i++){
	    	sumMinusFour += (int)word.charAt(i);
	    }
	    sumMinusFour -= 4;
	    return sumMinusFour;
	}
	
	int hashing(int i, int k) {
	    return ((i * i) + k) % this.slots;
	}
	
	String wordInA(int index) {
	    String rtn = "";
	    for(int i = index; i < this.lengthOfA; i++) {
	        if(this.A[i] == '\0') {
	            break;
	        }
	        else {
	            rtn += this.A[i];
	        }
	    }
	    return rtn;
	}
	
	int Delete(String word) {
	    int loc = Search(word);
	    if (loc == -1) {
	        return -1;
	    }
	    occupied--;
	    for (int i = T[loc]; i < lengthOfA; i++) {
	        if (A[i] != '\0') {
	            A[i] = '*';
	        } else {
	            T[loc] = -2;
	            return loc;
	        }
	    }
	    return -1;
	}
	

public boolean Insert(String word) {
    if(Search(word) != -1) {
        return false;
    }
    while(1 + this.indexOfA + word.length() > this.lengthOfA || this.isFull()) {
        //this.doubleA();
       // this.doubleT();
    }
    for(int i=0; i<this.slots; i++) {
        int index = hashing(i, this.sumAsciiMinusFour(word));
        this.maxLoopToInsert++;
        if(this.T[index] < 0) {
            this.T[index] = this.indexOfA;
            for(int j=0; j<word.length(); j++) {
                this.A[this.indexOfA] = word.charAt(j);
                this.indexOfA++;
            }
            this.A[this.indexOfA] = '\0';
            this.indexOfA++;
            this.occupied++;
            return true;
        }
    }
    return false;
}

}
class HashBatch{
    private ArrayList<String> hashTable;
    private int tableSize;
    
    private String filename;
    private Lexicon lexLuther;

    public HashBatch(String filename) {
        this.filename = filename;
    }

   

    void Create(int slots) {
        lexLuther = new Lexicon(slots);
        return;
    }

    int Search(String word) {
        return lexLuther.Search(word);
    }

    String Print() {
        return lexLuther.Print();
    }
    
    

    boolean Empty() {
        return lexLuther.isEmpty();
    }

    boolean Full() {
        return lexLuther.isFull();
    }

    int Delete(String word) {
        return lexLuther.Delete(word);
    }

    boolean Insert(String word) {
        return lexLuther.Insert(word);
    }
    
    

    public HashBatch(int size) {
        hashTable = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            hashTable.add("");
        }
        tableSize = size;
    }
    public void Batch(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
        
        }
    }
    
    void Batch() {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {

                String firstWord = line.substring(0, line.indexOf(" "));

                // Insert
                if(firstWord.equals("10")) {
                    String secondWord = line.substring(firstWord.length() + 1, line.length() - 1);
                    boolean inserted = Insert(secondWord);
                    if(!inserted){
                        // Not Inserted
                        int loc = Search(secondWord);
                        System.out.print(secondWord + " ");
                        if(loc == -1){
                            System.out.println("\toverflow and cannot insert");
                        }
                        else{
                            System.out.println("\tfound at slot " + Integer.toString(loc));
                        }
                        System.out.println();
                    }
                }

                // Delete
                else if(firstWord.equals("11")) {
                    String secondWord = line.substring(firstWord.length() + 1, line.length() - 1);
                    int deletedIndex = Delete(secondWord);
                    System.out.print(secondWord + " ");
                    if(deletedIndex == -1){
                        System.out.print("\tnot found");
                    }
                    else{
                        System.out.print("\tdeleted from slot " + Integer.toString(deletedIndex));
                    }
                    System.out.println();
                }

                // Search
                else if(firstWord.equals("12")) {
                    String secondWord = line.substring(firstWord.length() + 1, line.length() - 1);
                    int loc = Search(secondWord);
                    System.out.print(secondWord + " ");
                    if(loc == -1){
                        System.out.print("\tnot found");
                    }
                    else{
                        System.out.print("\tfound at slot " + Integer.toString(loc));
                    }
                    System.out.println();
                }

                // Print
                else if(firstWord.equals("13")) {
                    System.out.println(Print());
                }

                // Create
                else if(firstWord.equals("14")) {
                    String secondWord = line.substring(firstWord.length() + 1, line.length() - 1);
                    int slots = Integer.parseInt(secondWord);
                    Create(slots);
                }

                // Comment
                else if(firstWord.equals("15")) {
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
