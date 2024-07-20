package pepcoding.peprecursionarray;

public class maxarray {
    public static void main(String[] args) {
        int [] arr={15,11,40,4,4,9};
        System.out.println(maxOfArray(arr,0));
    }
    public static int maxOfArray(int[] arr, int idx){

        //wrong
        //base condition
        if(idx==arr.length-1){
            return idx;
        }
        if (arr[idx]>arr[idx+1]) {
            return idx;
        }
        else{
            return maxOfArray(arr,idx+1);
        }
    }
}
