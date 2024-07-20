package pepcoding.array;

import java.util.Scanner;

public class wave2d {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int r= scn.nextInt();
        int c= scn.nextInt();
        int [][]one=new int[r][c];
        for (int i = 0; i <one.length ; i++) {
            for (int j = 0; j <one[i].length ; j++) {
                one[i][j]= scn.nextInt();
            }
        }


        for (int j = 0; j <one[0].length; j++) {
            if(j%2==0){
                for (int i = 0; i < one.length; i++) {
                    System.out.print(one[i][j]);
                }
            }else {
                for (int i =one.length-1; i >=0 ; i--) {
                    System.out.print(one[i][j]);
                }
            }

        }
    }
}
