import java.util.prefs.PreferenceChangeEvent;

public class Lee2 {
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int d = prices[i]-prices[i-1];
            if((prices[i]-prices[i-1])>0){
                sum+=prices[i]-prices[i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int n = maxProfit(prices);
        System.out.println("n = " + n);
    }
}
