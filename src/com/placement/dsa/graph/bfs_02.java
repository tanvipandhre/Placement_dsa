package com.placement.dsa.graph;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class bfs_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	/*	
	String[] strs = {"flower", "flight", "flow"};
	TreeMap<String, Integer> map = new TreeMap<String, Integer>();
	 int i = 0;
	 for(int j= 0;j<strs.length;j++){
		     String s = strs[j];
		      while(i< s.length()){
		          if(map.containsKey(s.substring(0,i+1)))
		     map.put(s.substring(0, i+1),map.get(s.substring(0,i+1))+1);
		          else
		              map.put(s.substring(0, i+1),1);    
		     i+=1;
		      }
		      i=0;
	 }
	 /*List<String> list = new ArrayList<String>();
     for(Map.Entry<String, Integer> itr: map.entrySet()){
         
         if(itr.getValue() == strs.length) 
             list.add(itr.getKey());
         
     }
     
     System.out.println(list.get(list.size() -1));*/
	 /*String temp = "";
	 for(Map.Entry<String, Integer> itr: map.entrySet()) {
		 if(itr.getValue() == strs.length ) {
			 temp = itr.getKey();
		 }else
			 break;
	 }*/
    
   
    // return list.get(list.size() -1);
		/*int[] prices = {};
		int ls = prices[0], diff = 0;
        int index = 0;
        for(int i = 0 ;i < prices.length; i++){
            if(prices[i] < ls ){
                ls = prices[i];
                index = i;
            }
        }
        int ms = prices[index+1];
        for( int j = index+1; j< prices.length; j++){
            if(prices[j] > ms){
                ms = prices[j];
            }
        }*/
		/*int[] prices = {2, 4, 1};
		int x = prices[0];
        int diff = 0, ans = 0;
        for(int i = 1;i < prices.length; i++){
            diff = prices[i] - x;
            x = Math.min(prices[i], diff);
            ans = Math.max(ans,diff);
            
        }*/
		
		/*String number = "123";
		
		char digit = '3';
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i< number.length(); i++) {
			if(number.charAt(i) == digit) {
				list.add(i);
			}
		}
		List<String> numberList = new ArrayList<String>();
		
		for(int i = 0;i< list.size(); i++) {
		
			int m = list.get(i);
			String s = number.substring(0, m) +  number.substring(m+1, number.length());
			System.out.println(s);
			numberList.add(s);
			
		}
		
		Collections.sort(numberList, Collections.reverseOrder());
		System.out.println(numberList.get(0));*/
		/*boolean flag = false;
		int[] nums = {1, 2, 3, 1};
		Set<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			set.add(i);
		}
		if(nums.length == set.size())
			flag = true;*/
		/*
		boolean flag = false;
		//int[] cards = {3, 4, 2, 3, 4, 7};
		int[] cards = {1, 0, 5, 3};
		List<Integer> sizeList = new ArrayList<Integer>();
		Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for(int i = 0 ; i< cards.length; i++) {
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(cards[i]);
        	for(int j = i+1 ; j< cards.length; j++) {
        		if(cards[i] == cards[j]) {
        			list.add(cards[j]);
        			flag = true;
        			break;
        			
        		}else {
        			
        			list.add(cards[j]);
        			
        		}
        			
        		
        	}
        	
        	int size = 0;
        	if(flag) {
        		map.put(cards[i], list);
        		 size = list.size();
        		 sizeList.add(size);
        		 
        	}
        		
        	else {
        		map.put(cards[i], new ArrayList<Integer>());
        		
        	}
        	
        	flag = false;
        		
        	
        }
        
      
        if(sizeList.isEmpty())
        	System.out.println(-1);
        else {
        	int min = sizeList.get(0);
        	for(int i = 0; i < sizeList.size(); i++) {
        		if(min > sizeList.get(i)) {
        			min = sizeList.get(i);
        		}
        	}
        }*/
        
        
        
        //System.out.println(min);
			/*int[] cards = {3,4,2,3,4,7};
			boolean flag=true;
		  Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
	        for(int i = 0; i<cards.length; i++){
	            if( !map.containsKey(cards[i])) {
	            	List<Integer> list = new ArrayList<Integer>();
	            	list.add(i);
	            	map.put(cards[i], list);
	            }else {
	            	map.get(cards[i]).add(i);
	            }
	        }
	        int ans = 100001;
	        
	        for(Map.Entry<Integer, List<Integer>> itr: map.entrySet()) {
	        	List<Integer> list = itr.getValue();
	        	for(int i = 1; i < list.size(); i++) {
	        		int diff = list.get(i) - list.get(i-1)+1;
	        		ans = Math.min(diff, ans);
	        		flag=false;
	        	}
	        }
	        if(flag)
	        	return -1;
	        else
	        	return ans;*/
		
		/*
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			map.put(i, nums[i]);
		}
		int product = 1;
		for(int i = 0; i < nums.length; i++) {
			product *= nums[i];
			
		}
		System.out.println(product);	
		for(int i = 0; i < nums.length ; i++) {
			ans[i] = product / nums[i];
			System.out.print(ans[i] + " ");
		}*/
		/*int[] nums = {1, 2, 3, 4};
		int[] ans = new int[nums.length];
		int[] left = new int[nums.length];
		int[] right = new int[nums.length + 1];
		left[0] = nums[0];
		for(int i = 1; i < nums.length ; i++) {
			left[i] = left[i-1] * nums[i];
			System.out.print(left[i] + " ");
		}
		right[nums.length - 1] = nums[nums.length - 1];
		for(int i = nums.length - 2 ; i >= 0; i--) {
			right[i] = nums[i] * right[i+1];
			System.out.println(right[i] + " ");
		}
		right[nums.length] = 1;
	   ans[0] = right[0];
		for(int i = 1; i < nums.length; i++) {
					
			ans[i] = left[i-1] * right[i+1];
		}*/
		/*String s = "anagram";
		String t = "nagaram";
		boolean flag=true;
		char sca[] = s.toCharArray();
		char tca[] = t.toCharArray();
		Arrays.sort(sca);
		Arrays.sort(tca);
		for(int i=0;i<sca.length; i++) {
			if(sca[i] != tca[i]) {
				flag = false;
				break;
			}
				
		}*/
		int n = 19;
		int sum = 0;
        boolean flag = false;
        int mh = n % 100, mu = n % 10;
        if( mh == mu )
        	System.out.println("false");
        while( n !=1 && !flag ) {
        	
        	while( n != 0){
        		int m = n % 10;
              
                sum += m * m;
                n = n / 10;
                
               if( n == 0 )
            	   break;
               
            }
        	 n = sum;
        	sum = 0;
        }
        
        
        if(n == 1)
            System.out.println( "true" ); 
        else
            System.out.println("false");
		//Date date = System.
		//Question 1
		 /* DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yyyy/dd ");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now)); */
		   
		 //Question 2
		/*Calendar c1 = Calendar.getInstance();
		  
      
        c1.set(Calendar.MONTH, 8);
  
     
        c1.set(Calendar.DATE, 06);

        c1.set(Calendar.YEAR, 2022);
  
        
        Date dateOne = c1.getTime();
  
       
        dateOne.setTime(1000);
  
        System.out.println("Date after setting"
                           + " the time: "
                           + dateOne);*/
  
		boolean iss = isHappy(2);
		
		
	}
	private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
