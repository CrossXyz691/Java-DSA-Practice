class Solution {
    public static double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int item = prices.length-1;
        int discount1 = discounts.length-1;

        double sum = 0;

        for (int i = 0; i < prices.length; i++) {
            if(item>=0 && discount1>=0){
                int price = prices[item];
                int discount = discounts[discount1];
                sum += amount(price, discount);
            }
            else{
                sum+=prices[item];
            }
            item--;
            discount1--;
        }


        return sum;
    }

    static double amount(double price, double discount){
        return price * (100 - discount) / 100;
    }
}