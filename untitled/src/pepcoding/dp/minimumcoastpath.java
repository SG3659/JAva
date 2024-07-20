package pepcoding.dp;

public class minimumcoastpath {
    public static void main(String[] args) {
        int [][]arr={{9,8,7},{6,5,4},{3,2,1}};
        int n= args.length;
        int m= arr[0].length;
        int [][]dp=new int [n][m];// dp array create
        for (int i=dp.length-1;i>=0;i--){
            for (int j = dp[0].length-1; j >=0 ; j--) {
                //last arr no is equal to dp array
                if (i == dp.length - 1 && j == dp[0].length-1) {
                    dp[i][j] = arr[i][j];
                }
                // last row sum
                else if (i==dp.length-1) {
                    dp[i][j]=dp[i][j+1]+arr[i][j];
                }
                // last col sum
                else if (j==dp[0].length-1) {
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                // where it show the
                else {
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);

    }

}
