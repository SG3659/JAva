package pepcoding.dp;

import java.util.Scanner;

public class fibbo {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int ans =fibo(n,new int [n+1]);
        System.out.println(ans);
    }
// without dp
   /* public static int fibo (int n){
        if(n==0 || n==1){
            return n;
        }
        System.out.println("hello" + n);
        int fibn =fibo(n-1)+fibo(n-2);
        return fibn;
    }*/

    // with dp
    // here we store the repeated rec ans in qb
    public static int fibo(int n, int [] qb){
        if(n==0 || n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        System.out.println("hello" + n);
        int fibn =fibo(n-1,qb)+fibo(n-2,qb);
        qb[n]=fibn;
        return fibn;
    }
}
