package pepcoding.array;

import java.util.Arrays;

public class inversearray {
    public static void main(String[] args) {
        int []arr ={3,4,1,2,0};
        int n= arr.length;
        int []inv=new int [n];
        for (int i = 0; i <arr.length ; i++) {
            int v=arr[i];
            inv[v]=i;
        }
        System.out.println(Arrays.toString(inv));
    }
}
