import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static pepcoding.sort.bubblesort.swap;

public class debuging {
    public static void main(String[] args) {

        //33. Search in Rotated Sorted Array
//            int [] nums={4,5,6,7,0,1,2};
//            int target=2;
//            int l=0;
//            int h=nums.length-1;
//            while(l<=h){
//                int m=(l+h)/2;
//                if(target==nums[m]){
//                    System.out.println(m);;
//                }
//                if(nums[l]<nums[m]){
//                    if(nums[l]<=target && target<=nums[m]){
//                        h=m-1;
//                    }else{
//                        l=m+1;
//                    }
//                }else{
//                    if(nums[m]<=target && target<=nums[h]){
//                        l=m+1;
//                    }else{
//                        h=m-1;
//                    }
//                }
//                System.out.println(m);
//            }



//        int [] nums={3,4,5,1,2};
//        int l=0;
//        int h=nums.length-1;
//        while(l<h){
//         int m=(l+h)/2;
//         if(nums[m]>=nums[l]){
//             l=m+1;
//         }else{
//             h=m;
//         }
//        }
//        System.out.println(nums[l]);
        int arr []={1,2,3,4,5,6};
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}