package pepcoding.array;

import java.util.Scanner;

public class sprial2darray {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int r1= scn.nextInt();
        int c1= scn.nextInt();
        int [][]arr=new int[r1][c1];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]= scn.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr= arr.length-1;
        int maxc=arr[0].length-1;
        int tne=r1*c1;// total number of element
        int cnt=0;// count number one by one

        while(cnt<tne){
            // left wall
            for (int i = minr, j=minc; i <=maxr && cnt<tne  ; i++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            // bottom wall
            for (int j = minc, i=maxr; j <=maxc && cnt<tne; j++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            // rigth wall
            for (int i = maxr,j=maxc; i >=minr && cnt<tne; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;

            // top wall
            for (int j = maxc,i=minr; j >=minc && cnt<tne; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }
}
