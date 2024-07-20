package pepcoding.dp;

public class goldmine {
    public static void main(String[] args) {
        int [][]arr={{9,8,7},{6,5,4},{3,2,1}};
        int n= args.length;
        int m= arr[0].length;
        int [][]dp=new int [n][m];

            for (int j = arr[0].length-1; j >=0 ; j--) {//col
                for (int i = arr.length-1;  i >= 0; i--) {//row
                //last col
                if (j== arr[0].length-1){
                    dp[i][j]=arr[i][j];
                }
                // firstrow
                else if (i==0) {
                     dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1])+arr[i][j];
                }
                //last row
                else if (i== arr.length-1) {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i-1][j+1])+arr[i][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j+1],Math.max( dp[i+1][j+1],dp[i-1][j+1]))+arr[i][j];
                }
            }
        }
        // find the max in first col
        int max =dp[0][0];
        for (int i = 1; i < dp.length ; i++) {
            if(dp[i][0]>max){
                max=dp[i][0];
            }
        }
        System.out.println(max);
    }
}
