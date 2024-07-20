package pepcoding.array;

public class span {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 54, 10};
        int max = arr[0];
        int min = arr[0];
        for (int i=1; i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        int c =max-min;
        System.out.println(c);
    }
}
