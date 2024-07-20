package pepcoding.peprecursionarray;

import java.util.Scanner;

public class lastindex {
    public static void main(String[] args) {
        Scanner re=new Scanner(System.in);
       /* int n= re.nextInt();
        int [] arr= new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= re.nextInt();
        }*/
        int [] arr={15,11,40,4,4,9,};
        /*System.out.println( lastIndex(arr,arr.length-1,4));*/
        System.out.println( lastindex(arr,0,4));
    }// moving from backside
    public static int lastIndex(int[] arr, int idx, int x){
        //baae
        if(idx==-1){
            return -1;
        }
        if(arr[idx]== x){
            return idx;
        }
        else {
            return lastIndex(arr,idx-1,x);
        }
    }
    //moving starting
    public static int lastindex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int  lisa=lastindex(arr,idx+1,x);//1
        if(lisa==-1){//2
            if(arr[idx] == x){//2.1
                return idx;//2.2
            }else{
                return -1;//2.3
            }
        }else{
            return lisa;//3
        }
    }

}
