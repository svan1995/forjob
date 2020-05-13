package suanfa;

import java.util.Arrays;

public class ZeroOneBag {
    public static void main(String[] args) {
        int[] w = {2,1,3,2};
        int[] v = {12,10,20,15};

        System.out.println(pack(w,v,2));
    }

    private static int pack(int[] w, int[] v, int max) {
        int[][] dp = new int[v.length+1][max+1];
        int sub;
        for (int i=1;i<dp.length; i++){
            for (int j=1;j<dp[0].length;j++){
                if ((sub = j - w[i-1]) >= 0){
                    dp[i][j] = Math.max(dp[i-1][j], v[i-1] + dp[i-1][sub]);
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[v.length][max];
    }
}
