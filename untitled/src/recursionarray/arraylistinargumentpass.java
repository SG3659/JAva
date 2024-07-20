package recursionarray;

import java.util.ArrayList;

public class arraylistinargumentpass {
    public static void main(String[] args) {
        int [] a={1,2,3,4,4,5};
        System.out.println(linear(a,4,0,new ArrayList<>()));
    }
    static ArrayList linear(int [] a,int target, int index ,ArrayList<Integer>list){
        //basecodition
        if(index==a.length){
            return list;
        }
        if(a[index]==target){
            list.add(index);
        }
        return linear(a,target,index+1,list);
    }
}
