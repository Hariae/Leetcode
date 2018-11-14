package DP;

public class Stocks {

	public int maxProfit(int[] prices) {
		
		int profit = 0;
		/*for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[i] < prices[j] && i < j) {
					int temp = prices[j] - prices[i];
					if(temp > profit) {
						profit = temp;
					}
				}
			}
		}*/
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i]< min) {
				min = prices[i];
			}
			else if(prices[i] - min > profit) {
				profit = prices[i] - min;
			}
		}
		
	
		
		System.out.println("Profit: " + profit);
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stocks obj = new Stocks();
		int[] prices = {7,6,4,3,1};
		obj.maxProfit(prices);
	}

}
