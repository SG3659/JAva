package pepcoding.array;

public class reversearray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        reverse(arr, arr.length);
    }
    static void reverse(int[]arr,int n){
        int[] b = new int[n];//new array
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j--;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }

    }
}
