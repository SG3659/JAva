package pepcoding.search;

import java.util.Arrays;

public class firstandlast {
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        int data =8;
        int s=0;
        int l = arr.length-1;
        int fi=-1;
        int [] ans =new int[2];
        while (s<=l){
            int m=(s+l)/2;
            if(data<arr[m]){
                l=m-1;
            } else if (data>arr[m]) {
                s=m+1;
            }else{
                fi=m;
                l=m-1;

            }

        }
        s=0;
        l= arr.length-1;
        int li =-1;
        while(s<=l){
            int m=(s+l)/2;
            if (data>arr[m]){
                s=m+1;
            } else if (data<arr[m]){
                l=m-1;
            }else {
                li=m;
                s=m+1;

            }
        }
        ans[0]=fi;
        ans[1]=li;
        for (int i=0;i< ans.length;i++) {
            System.out.println(ans[i]);
        }



    }
}
