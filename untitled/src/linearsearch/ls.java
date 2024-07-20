package linearsearch;

public class ls {
    public static void main(String[] args) {
        int [] arr={18,12,9,14,77,50};
        int n=14;
        int target=14;

//        for (int i =0;i<arr.length;i++) {
//            if (arr[i] == n) {
//                System.out.println(i);
//            }
//        }
        int ans=linearserch(arr,target);
        System.out.println(ans);

    }
     static int linearserch(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i =0;i<arr.length;i++) {
            int element =arr[i];
            if(element== target){
                return i;
             }
        }

         return -1;
     }
}
