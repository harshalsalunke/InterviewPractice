package LeetCodeProblem;

public class BuyAndSellStock {

    //Easy
    //Bulling and selling the stock
    static void main(String[] args) {
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        System.out.println(buyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length ; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
