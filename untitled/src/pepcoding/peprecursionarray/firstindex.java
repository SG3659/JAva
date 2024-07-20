package pepcoding.peprecursionarray;

import java.util.Scanner;

public class firstindex {
    public static void main(String[] args) {
        Scanner re=new Scanner(System.in);
        int n= re.nextInt();
        int [] arr= new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= re.nextInt();
        }
        System.out.println(firstIndex(arr,0,4));

    }
    public static int firstIndex(int[] arr, int idx, int x){
        //baese
        if(idx== arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }else {
            return firstIndex(arr,idx+1,x);
        }
    }
}
