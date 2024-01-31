package com.placement.dsa.arrays.medium;

public class BuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Bruteforce
	public static int bestTimeToBuyAndSellStock_brute(int []prices) {
        // Write your code here.
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){           
            
            for(int j=i+1;j<prices.length;j++){
                
                if(prices[j] > prices[i]) maxProfit = Math.max(prices[j]- prices[i], maxProfit);
            }

        }
        return maxProfit;
    }
	//optimal
	public static int bestTimeToBuyAndSellStock_optimal(int []prices) {
        // Write your code here.
        int maxProfit = 0;
        int mini = prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<mini) mini = prices[i];
            maxProfit = Math.max(maxProfit, prices[i] - mini);
        }
        
        return maxProfit;
    }

}
