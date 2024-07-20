package pepcoding.leetcodde;

public class SingleElementinaSortedArray540 {
    public static void main(String[] args) {
        int [] arr= {1,1,2,2,3,3,4,5,5,6,6};
        int n=arr.length;
        if(n==1) System.out.println(arr[0]);
        if(arr[0]!=arr[1]) System.out.println(arr[0]);
        if(arr[n-1]!=arr[n-2]) System.out.println(arr[n-1]);
        int s=1;
        int l=n-1;
        while(s<l){
            int m=(s+l)/2;
            if(arr[m]!=arr[m-1] && arr[m]!=arr[m+1]){
                System.out.println(m);
            }
            //left side eliminate
            //1st odd present
            //2nd even present
            if( (m%2==1 && arr[m]==arr[m-1])||(m%2==0 && arr[m]==arr[m+1])){
                s=m+1;
            }
            //rigth sidde elimenate
            else{
                l=m-1;
            }
        }
    }
}
