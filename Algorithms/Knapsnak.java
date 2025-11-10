public class Knapsnak {
    static int knapsnak(int[] values,int C,int weights[]){
        int n = values.length;
        int dp[][] = new int[values.length+1][C+1];
        for (int i = 1; i <= n; i++) {          
            for (int j = 1; j <= C; j++) { 
                if(weights[i-1]<= j){
                    int inc = values[i-1]+dp[i-1][j - weights[i-1]];
                    int exc = dp[i-1][j];
                    dp[i][j] = Math.max(inc,exc);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][C];
    }
    public static void main(String[] args){
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        System.out.println("Maximum value = " + knapsnak(values, capacity, weights));
    }
}