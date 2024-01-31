package com.placement.dsa.arrays.easy;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	  public static List<Integer> getTrucksForItems(List<Integer> trucks, List<Integer> items) {
	        List<Integer> result = new ArrayList<>();
	        for (int item : items) {
	            int minIndex = -1;
	            for (int j = 0; j < trucks.size(); j++) {
	                if (trucks.get(j) >= item) {
	                    if (minIndex == -1 || j < minIndex) {
	                        minIndex = j;
	                    }
	                }
	            }
	            result.add(minIndex);
	        }
	        return result;
	    }
	}


}
