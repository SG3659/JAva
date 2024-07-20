package pepcoding.sort;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr={1,0};
        for (int itr =1;itr<= arr.length-1 ;itr++){//move for iteration
            for (int j = 0; j <arr.length-itr ; j++) {//element comprison;
                if (arr[j+1]<arr[j]){
                    swap(arr,j+1,j);
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void swap (int []arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
