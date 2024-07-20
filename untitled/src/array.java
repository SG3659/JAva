import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class array {
    public static void main(String[] args) {
        Scanner scn =new Scanner(in);
//        int []arr=new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i]= scn.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i] +"");
//        }

        //Dynamic array

        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        //initiallisation
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
        }
       //add element
        for (int i = 0; i <3 ; i++) {//
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(scn.nextInt());

            }

        }
        System.out.println(list);

        // swap array


        int [] arr ={1,2,3,4,5,6};
        swap (arr,1,2);
    }
    static void swap (int[]arr, int index1,int index2){
        int temp= arr[1];
        arr[1]=arr[2];
        arr[2]=temp;

    }
}
