public class buyAndsellstock121 {
    static void main() {
        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }

    public static  int maxProfit(int[] prices) {
//        int result = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                if (prices[i] >= prices[j]) continue;
//                int profit = prices[j] - prices[i];
//                if (profit > result){
//                    result = profit;
//                }
//            }
//        }
//        return result;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}
