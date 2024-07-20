package pepcoding.array;

public class diasum {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int p=0;
        int s=0;
        int n= arr.length;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if(i==j){
                    p+=arr[i][j];
                }
                if((i+j)==(n-1)){
                    s+=arr[i][j];
                }


            }
        }
        if(n%2==0){
            s-=arr[n/2][n/2];
        }
        System.out.println("p:"+p);
        System.out.println("s:"+s);
    }
}
