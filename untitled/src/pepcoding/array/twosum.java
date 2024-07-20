package pepcoding.array;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=18;
        for (int i=0; i< nums.length;i++){
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    System.out.print(i);
                }

            }
        }
    }
}
