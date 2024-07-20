package pepcoding.array;

public class rotate2darrayby90clockwise {
    public static void main(String[] args) {
         int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         // transpose arr
        // square matrix
        for (int i = 0; i < arr.length ; i++) {
            for (int j =i ; j <arr[i].length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // inverse arr

        for (int i = 0; i < arr.length ; i++) {
            int li =0;
            int ri =arr[i].length-1;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
        display(arr);
    }
    public static void display (int[][]arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
