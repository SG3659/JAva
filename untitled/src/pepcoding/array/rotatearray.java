package pepcoding.array;

public class rotatearray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        rotate(arr,2);
    }
    public static void rotate(int[] arr ,int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        //part 1
        revrse(arr,0,arr.length-k-1);
        //part2
        revrse(arr,arr.length-k,arr.length-1);

        // reverseall
        revrse(arr,0, arr.length);
    }
    public static void revrse(int [] arr, int i, int j){
        int li =i;
        int ri= j;
        while(li<ri){
            int temp =arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }

    }


}
