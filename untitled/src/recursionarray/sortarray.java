package recursionarray;

public class sortarray {
    public static void main(String[] args) {
        int [] a={1,2,4,5};
        System.out.println(sort(a,0));
    }
    public static boolean sort(int [] a,int index){
        //base condition
        if(index==a.length-1){
            return true;
        }
         return a[index] < a[index + 1] && sort(a, index + 1);
    }
}
