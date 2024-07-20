package recursionarray;

import java.util.ArrayList;

public class arraylistnoargumentpass {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,4};
        ArrayList<Integer>ans=linear(a,4,0);
        System.out.println(ans);
    }
    public static ArrayList linear(int [] a,int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
        //base condition
        if(index== a.length){
            return list ;
        }
        if(a[index]== target){
            list.add(index);
        }
        ArrayList<Integer>ansofreturn=linear(a,target,index+1);
        list.addAll(ansofreturn);
        return list;


    }
}
