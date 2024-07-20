package linearsearch;

import java.util.Arrays;

public class arraylinear2d {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=5;
        int[] ans=search(arr,target);// format of return value
        System.out.println(Arrays.toString(ans));
    }
    static int [] search(int[][]arr,int target){
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                int element =arr[i][j];
                if(element== target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
