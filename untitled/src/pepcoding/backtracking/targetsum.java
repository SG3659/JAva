package pepcoding.backtracking;

public class targetsum {
    public static void main(String[] args) {
    int [] arr={10,20,30};
    targetsum(arr,0," ",0,30);
    }
    //sos =sum ofsubset
    public static void targetsum( int [] arr, int idx , String p,int sos, int tar){
        if(idx==arr.length){
            if(sos==tar) {
                System.out.println(p);
            }
            return;
        }
        targetsum(arr,idx+1,p+arr[idx],sos+arr[idx],tar);//pick
        targetsum(arr,idx+1,p,sos,tar);//pick


    }
}
