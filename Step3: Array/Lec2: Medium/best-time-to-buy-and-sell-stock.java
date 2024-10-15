class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            int sell=prices[i];
            profit=Math.max(profit,sell-buy);
        }
        return profit;
    }
}
