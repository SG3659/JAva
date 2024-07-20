package recursionarray;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
      int [] a={3,2,8,1,9};
        /*System.out.println(linear(a,4,0));*/
        /*System.out.println(linear2(a,9,0));*/
        /*System.out.println(linearlast(a,3,a.length-1));*/
        linearall(a,2,0);
        System.out.println(list);// it is used in duplicate of array using recursion

    }
    public static boolean linear(int[] a,int target,int index){
        //base condition
        if(index==a.length-1){
            return false;
        }
        return a[index]==target || linear(a,target,index+1);
    }
    public static int  linear2(int[] a,int target,int index) {
        if (index == a.length ) {
            return -1;
        }

        if (a[index] == target) {
            return index;

        } else {
            return linear2(a, target, index+1);
        }
    }
    public static int  linearlast(int[] a,int target,int index) {
        if (index == -1) {
            return -1;
        }

        if (a[index] == target) {
            return index;

        } else {
            return linearlast (a, target, index - 1);
        }
    }
    static ArrayList<Integer>list= new ArrayList<>();// this is not rigth way to pass arraylist
    //rigth way is to find the
     static void linearall(int[] a, int target, int index) {
        if (index == a.length) {
            return ;
        }

        if (a[index] == target) {
            list.add(index);

        }
        linearall (a, target, index + 1);

    }

}
