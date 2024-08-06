package foo;

public class BestTimeToSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));


    }

    public static int maxProfit(int[] prices) {

       if (prices == null || prices.length < 1) return 0;
       int min = prices[0];
       int max_profit = 0;

       for (int i = 1; i < prices.length; i++){
           max_profit = Math.max(max_profit, prices[i] - min);
           min = Math.min(min, prices[i]);
       }
       return max_profit;
    }
}
