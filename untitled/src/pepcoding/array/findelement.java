package pepcoding.array;

public class findelement {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,15};
        int target=4;
        for (int i=0;i<arr.length;i++){
            if(arr[i]== target){
                System.out.println(i);
            }
        }
    }
}
