class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int profit=0;
        int sell=1;
        for(int i=1;i<prices.length;i++){
            sell=i;
            if(prices[sell]<prices[buy]){
                buy=sell;
            }
            if(prices[sell]-prices[buy]>profit) profit=prices[sell]-prices[buy];
            
        }      
        return profit;
    }
}
