class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;
        int profit;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy) buy=prices[i];
            profit=prices[i]-buy;
            if(profit>maxProfit) maxProfit=profit;

        }
        return maxProfit;
    }
}
