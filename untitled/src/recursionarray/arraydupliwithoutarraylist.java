package recursionarray;

public class arraydupliwithoutarraylist {
    public static void main(String[] args) {
    int [] arr={15,11,40,4,4,9};
        System.out.println(allIndices(arr,4,0,0));
    }
    public static int[] allIndices(int[] arr, int target, int idx, int count) {
        // base condition
        if(idx==arr.length){
            return new int[count];

        }
        int [] store;
        if(arr[idx]==target){
            store=allIndices(arr,target,idx+1,count+1);
        }else{
            store= allIndices(arr,target,idx+1,count);
        }
        return store;

    }
}
