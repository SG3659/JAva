package pepcoding.leetcodde;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX1608 {
    public static void main(String[] args) {
        int [] nums={3,5};
        int x= nums.length;// x such that there are exactly x numbers in nums that are greater than or equal to x.
        int []count=new int[x+1];
        // checking x value
        for (int elem:nums){
            if(elem>=x){
                count[x]++;// increment valie int last index
            }else {
                count[elem]++;// increment value in first index
            }
        }

        int res=0;
        for (int i = count.length-1; i >0 ; i--) {
            res += count[i];
            if (res == i) {
                System.out.println(i);
            }else {
                System.out.println(-1);
            }
        }
    }
}
