public class MakingChange {
    public void algorithm(){
        /*
            minCoins(coins[], N):
                dp[0] = 0
                K = coins.size
                for x = 1 to N: -> N
                    dp[x] = ∞
                    for coin in coins:  -> K 
                        if x - coin >= 0:
                            dp[x] = min(dp[x], 1 + dp[x - coin])
                return dp[N] != ∞ ? dp[N] : -1


                Total TimeComplexity = O(N.K) 
        */
    }
}