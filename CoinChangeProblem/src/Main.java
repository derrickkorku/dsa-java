import java.util.Arrays;

public class Main {
    public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];

        Arrays.sort(coins);

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 0; i <= amount; i++){
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                } else {
                    break;
                }
            }
        }

        return dp[amount] > amount ? - 1 : dp[amount];
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}