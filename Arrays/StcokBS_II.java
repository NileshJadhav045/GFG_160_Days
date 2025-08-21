public class StcokBS_II {
    public static int maximumProfit(int prices[]) {
        int max = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.min(max, prices[i]);

            ans = Math.max(ans, prices[i] - max);
        }

        return ans;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 10, 1, 3, 6, 9, 2 };
        System.out.println(maximumProfit(prices));
    }
}
