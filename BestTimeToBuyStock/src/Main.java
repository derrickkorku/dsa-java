public class Main {
    public static int profit(int[] prices){
       int l = 0;
       int r = 1;
       int maxProfit = 0;

       while (r < prices.length){
           if (prices[r] > prices[l]) {
               int profit = prices[r] - prices[l];
               maxProfit = Math.max(profit, maxProfit);
           } else {
               l = r;
           }

           r++;
       }

       return maxProfit;
    }
    public static void main(String[] args) {
        System.out.println(profit(new int[]{7,1,5,3,6,4}));
    }
}