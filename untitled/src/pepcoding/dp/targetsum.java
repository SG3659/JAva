package pepcoding.dp;

public class targetsum {
    public static void main(String[] args) {
        int [] arr= {4,7,1,3};
        // target(arr,0," ",0,10);
        int target =10;
        boolean [][] dp=new boolean [arr.length+1][target+1];
        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                if(i==0 && j==0){
                    dp[i][j]=true;
                } else if (i==0) {
                    
                } else if (j==0) {

                }else {

                }


            }

        }

    }
    /*public static void target(int [] arr ,int idx,  String p,int sos, int tar){
        if(idx== arr.length){
            if(sos==tar){
                System.out.println(p);
            }
        }
        target(arr, idx+1, p+arr[idx],sos+arr[idx],tar);
        target(arr,idx+1,p,sos,tar);
    }*/

}
