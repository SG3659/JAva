package array;

import java.util.Arrays;

public class concetation1929 {
    public static void main(String[] args) {
        int []nums={1,2,1};
        int []ans =new int [2* nums.length];
        for (int i = 0; i <2*nums.length ; i++) {
            if(i< nums.length){
                ans[i]=nums[i];
            }else{
                ans[i]=nums[i- nums.length];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
