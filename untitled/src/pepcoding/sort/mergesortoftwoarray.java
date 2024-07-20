package pepcoding.sort;

import java.util.Arrays;

public class mergesortoftwoarray {
    // merge sort
    public static void main(String[] args){
        int[]arr={5,4,3,1,2};
        arr=mergesort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergesort(int [] arr,int lo , int hi){
        if(lo==hi){
            int [] bsa=new int[1];
            bsa[0]=arr[lo];
            return bsa;
        }
        int m= (lo+hi)/2;

        int [] left=mergesort(arr,lo,m);
        int [] rigth=mergesort(arr,m+1,hi);
        int [] fsa= merge(left,rigth);
        return fsa;
    }


    public static int[] merge(int []first,int []second){
        int i=0,j=0,k=0;
        int [] mix={first.length+second.length};
        while(i<first.length && j<second.length){
            if(first[i]<=second[j]){
               mix[k]=first[i];
               i++;
               k++;}else{
                mix[k]=second[j];
                j++;
                k++;

            }
        }
        while(i<first.length) {
                mix[k] = first[i];
                i++;
                k++;

        }
        while(j<second.length) {
                mix[k] = second[j];
                j++;
                k++;

        }
        return mix;
    }

    /*
    int j=0;
    int k=0;
     int n=nums1.length;
        int m =nums2.length;
        int k=0;int j=0;
        int arr[]=new int [n+m];
        for(int i=0;i<n+m;i++){
            if(k<n&&j<m){
                if(nums1[k]<nums2[j]){
                    arr[i]=nums1[k];
                    k++;
                }else{
                    arr[i]=nums2[j];
                    j++;
                }
            }else if(k<n){
                arr[i]=nums1[k];
                k++;
            }else if(j<m){
                arr[i]=nums2[j];
                j++;
            }
        }
     */


}
