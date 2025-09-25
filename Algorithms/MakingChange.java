public class MakingChange {
    public void algorithm(){
        /*
            minCoins(coins[], N):
                dp[0] = 0
                for x = 1 to N:
                    dp[x] = ∞
                    for coin in coins:
                        if x - coin >= 0:
                            dp[x] = min(dp[x], 1 + dp[x - coin])
                return dp[N] if dp[N] != ∞ else -1
        */
    }
}