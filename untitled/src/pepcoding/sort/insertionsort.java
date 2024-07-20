package pepcoding.sort;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
     int [] arr={8,5,2,7,4,1};
        for (int i=1;i<arr.length;i++){
            for (int j = i-1; j >=0 ; j--) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void swap (int []arr, int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
