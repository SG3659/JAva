package pepcoding.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int [] arr={8,5,2,7,4,1};
        for (int i=0;i<arr.length;i++){
           int min=i;
            for (int j =i+1 ; j<arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                swap(arr,i,min);
            System.out.println(Arrays.toString(arr));
        }

    }
    public static void swap (int []arr, int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
