package Array;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example:
 *
 * Input: prices = [7, 1, 5, 3, 6, 4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */
public class BestTimeToBuySellStockLeetCode121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,6,3,4};
        BestTimeToBuySellStockLeetCode121 ms = new BestTimeToBuySellStockLeetCode121();
        System.out.println(ms.findBestTimeToBuySell2(prices));
    }

    /**
     *
     * @param prices
     * @return
     */
    public int findBestTimeToBuySell(int[] prices){
        int maxProfit = 0;
        int lowPrice =  prices[0];
        for(int i:prices){
            if(i<lowPrice){
                lowPrice=i;
            }else if(maxProfit<i-lowPrice){
                maxProfit=i-lowPrice;
            }
        }


        return maxProfit;
    }

    /**
     *
     * @param prices
     * @return
     */
    public int findBestTimeToBuySell2(int[] prices){
        int maxProfit = 0;
        int lowPrice =  prices[0];
        for(int i:prices){
            if(i<lowPrice){
                lowPrice=i;
            }else
                maxProfit=Math.max(maxProfit, i-lowPrice);
        }
        return maxProfit;
    }
}
