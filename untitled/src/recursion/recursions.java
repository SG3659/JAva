package recursion;

public class recursions {
    public static void main(String[] args) {
       // System.out.println(print (6));
        int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,4,0, arr.length));
        /*System.out.println(print(5));*/
        /*for (int i = 0; i <11 ; i++) {
            System.out.println(fiboformula(i));
        }*/
       /* System.out.println(fiboformula(2));*/
    }

    // binary search
    public static int  search (int [] arr, int target,int s,int e){

        if(s>e){
            return -1;
        }
        int m=(s+e)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]) {
            return search(arr, target, s, m - 1);
        } else {
            return search(arr, target, m + 1, e);
        }
    }
   /* static void print (int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }*/
    // fibbonaci no;
    /*static  int fiboformula(int n){
        return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));




    static int  print (int n){
        if(n==0){
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        return print(n-1)+print(n-2);*/

    }


