package pepcoding.array;

import java.util.Scanner;

public class multi2darray {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int r1= scn.nextInt();
        int c1= scn.nextInt();
        int [][]one=new int[r1][c1];
        for (int i = 0; i <one.length ; i++) {
            for (int j = 0; j <one[i].length ; j++) {
                one[i][j]= scn.nextInt();
            }
        }
        int r2= scn.nextInt();
        int c2= scn.nextInt();
        int [][]two=new int[r1][c1];
        for (int i = 0; i <two.length ; i++) {
            for (int j = 0; j <two[i].length ; j++) {
                one[i][j]= scn.nextInt();
            }
        }
        if (c1==r2){
            System.out.println("input invalid");
        }
        int [][]mul =new int [r1][c2];
        for (int i = 0; i < mul.length ; i++) {
            for (int j = 0; j < mul[i].length ; j++) {
                for (int k = 0; k <c1/*r2 also we put here*/; k++) {
                    mul[i][j]=one[i][k]*two[k][j];
                }
            }

        }
        for (int i = 0; i < mul.length ; i++) {
            for (int j = 0; j <mul[i].length ; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

    }
}
