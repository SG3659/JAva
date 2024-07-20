package pepcoding.dp;

import java.util.Scanner;

public class coincombination {
    public static void main(String[] args) {
        int amt =7;
        int [] arr ={2,3,6,7};
        int [] dp =new int [amt+1];
        dp[0]=1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = arr[i]; j <dp.length ; j++) {
                dp[j]+=dp[j-arr[i]];
            }
        }
        System.out.println(dp[amt]);
    }
}
