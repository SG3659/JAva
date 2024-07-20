package pepcoding.peprecursionarray;

import java.util.Arrays;

public class allindicies {
    public static void main(String[] args) {
    int [] arr={15,11,40,4,4,9};
        System.out.println(Arrays.toString(allIndices(arr,4,0,0)));

    }
    public static int[] allIndices(int[] arr, int target, int idx, int count) {
        // base condition
        if(idx==arr.length){
            return new int[count];

        }
        int [] store;

        if(arr[idx]==target){//1
            store=allIndices(arr,target,idx+1,count+1);//1.1
            store[count]=idx;//1.2
        }else{
            store= allIndices(arr,target,idx+1,count);//2
        }
        return store;

    }
}
