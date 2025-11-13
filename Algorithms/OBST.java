import java.util.*;

public class OBST {
    static int infinity = Integer.MAX_VALUE;

    public static int obst(int prob[]) {
        int n = prob.length;
        int[][] cost = new int[n][n];
        int[] prefix = new int[n];

        prefix[0] = prob[0];
        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] + prob[i];

        for (int i = 0; i < n; i++)
            cost[i][i] = prob[i];

        for (int d = 1; d < n; d++) { 
            for (int i = 0; i + d < n; i++) {
                int j = i + d;
                cost[i][j] = infinity;
                for (int r = i; r <= j; r++) {
                    int left = (r > i) ? cost[i][r - 1] : 0;
                    int right = (r < j) ? cost[r + 1][j] : 0;
                    int total = left + right + rangeSum(prefix, i, j);
                    cost[i][j] = Math.min(cost[i][j], total);
                }
            }
        }
        return cost[0][n - 1];
    }
    private static int rangeSum(int[] prefix, int i, int j) {
        if (i == 0) return prefix[j];
        return prefix[j] - prefix[i - 1];
    }

    public static void main(String[] args) {
        int[] prob = {3, 2, 4};
        System.out.println("Minimum cost of OBST = " + obst(prob));
    }
}
