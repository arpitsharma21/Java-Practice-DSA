package Array;

public class BuySellStock {
    public static int checkMaxProfit(int prices[]){
        int n = prices.length;
        //variable to calculate minimum buying price
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<n;i++){
            int Profit = 0;
            if(buyPrice < prices[i]){
                // Calculating Profit
                Profit = prices[i] - buyPrice;
                // finding the maximum value b/w the selling price or the maxProfit
                maxProfit = Math.max(Profit,maxProfit);
            }
            else{
                //if buying price is greater than selling price then buying price will have the selling price value
                //first for day1
                buyPrice = prices[i];
            }
        }
         return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int result = checkMaxProfit(prices);
        System.out.println("Maximum Profit is: "+ result);

    }
}
