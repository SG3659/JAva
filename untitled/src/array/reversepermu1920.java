package array;

public class reversepermu1920 {
    public static int[] main(String[] args) {
        int [] nums={0,2,1,5,3,4};
        int [] ans=new int [nums.length];
        for (int i = 0; i < nums.length ; i++) {
            ans[i]=nums[nums[nums[i]]];
        }
        return ans;
    }

}
