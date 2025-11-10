import java.util.*;
class Chainmatrix {
    static int infinity = Integer.MAX_VALUE;

    static int chainmatrix(int[] dimen){
        int n = dimen.length;
        int[][] dp = new int[n][n];
        for(int i =0; i < n;i++){
            Arrays.fill(dp[i],infinity);
            dp[i][i] = 0;
        }
        for(int length = 2 ; length < n ; length++){
            for(int i = 0 ; i < n-length ; i++){
                int j = i+length-1;
                for(int k= i ; k < j ; k++){
                    int cost = dp[i][k] + dp[k + 1][j] + dimen[i] * dimen[k + 1] * dimen[j + 1];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[0][n-2];
    }
    
    public static void main(String[] args){
        int[] dimen = {10, 30, 5, 60};
        System.out.println("Minimum cost = " + chainmatrix(dimen));
    }
}