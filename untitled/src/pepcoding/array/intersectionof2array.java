package pepcoding.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersectionof2array {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer> store=new ArrayList<>();
        for (int i = 0; i <nums1.length ; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i <nums2.length ; i++) {
            if(set.contains(nums2[i])){
                store.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int [] res=new int[store.size()];
        for (int i = 0; i < store.size() ; i++) {
            res[i]= store.get(i);
        }
        System.out.println(Arrays.toString(res));

    }
}
