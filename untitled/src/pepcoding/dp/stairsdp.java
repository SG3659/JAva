package pepcoding.dp;

import java.util.ArrayList;
import java.util.Scanner;

public class stairsdp {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int ans =getpath(n,new int [n+1]);
        System.out.println(ans);
    }
    // memoization
    public static int  getpath(int n,int [] qb){
        if(n==0){
            return 1;
        } else if (n<0) {
            return 0;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        System.out.println("hello"+n);
        int path1=getpath(n-1,qb);
        int path2=getpath(n-2,qb);
        int path3=getpath(n-3,qb);
        int p=path1+path2+path3;
        qb[n]=p;
        return p;
    }
    // tabulation
    public static int getpath2(int n){
    int [] qb =new int [n+1];

    qb[0]=1;
        for (int i = 1; i <n; i++) {
            if(n==1){
                qb[i]=qb[i-1];
            } else if (n==2) {
                qb[i]=qb[i-1]+qb[i-2];
            }else{
                qb[i]=qb[i-1]+qb[i-2]+qb[i-3];
            }
        }
        return qb[n];
    }
}
