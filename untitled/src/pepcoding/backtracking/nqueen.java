package pepcoding.backtracking;

import java.util.Scanner;

public class nqueen {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        //int [][]chess=new int[n][n];
        //queen(chess," ",0);

        boolean[][] board=new boolean[n][n];
        System.out.println(queen(board,0));

    }
  /*  public static void queen(int [][] chess, String qsf, int row){
        if(row== chess.length){
            System.out.println(qsf);
            return;
        }

            for (int col = 0; col < chess.length; col++) {
                if(isqueensafeplace(chess,row,col)==true) {
                    chess[row][col] = 1;
                    queen(chess, qsf + row + "-" + col + ",", row + 1);
                    chess[row][col] = 0;
                }

            }


    }*/
  /*  public static boolean isqueensafeplace(int[][] chess ,int row,int col){
        for (int i = row-1, j=col-1; i >=0 && j >=0 ; i--,j--) {// left diagnoal
            if(chess[i][j]==1){
                return false;
            }
        }
        for (int i = row-1,j=col; i >=0 ; i--) {//vertical
            if(chess[i][j]==1){
                return false;
            }
        }
        for (int i = row-1,j=col+1; i >=0 && j< chess.length ; i--,j++) {// diagonal rigth
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
    }*/


  static int queen (boolean [][] board,int row){
      if(row== board.length){
          display(board);
          System.out.println();
          return 1;
      }
      int count =0;
      // placing the queen for  every row and col
      for (int col = 0; col <board.length ; col++) {
          if(isqueensafe(board,row,col)) {
              board[row][col] = true;
              count += queen(board, row + 1);
              board[row][col] = false;
          }
      }
      return count ;
  }

    private static boolean isqueensafe(boolean[][] board, int row, int col) {
      //for vertical 
       /* for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false;
            }
        }*/
        //
        for (int i=row-1, j=col;i>=0;i--){
            if(board[i][j]){
                return false;
            }
        }


        // diagonal left
        /*int maxleft=Math.min(row,col);
        for (int i = 1; i <=maxleft ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }*/

        for (int i = row-1,j=col-1; i >=0 && j>=0 ; i--,j--) {
            if(board[i][j]){
                return false;
            }
        }

        //diagonal rigth
        /*int maxrigth=Math.min(row, board.length-col-1);
        for (int i = 1; i <=maxrigth; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }*/
        for (int i = row-1,j=col+1; i >=0 && j<board.length ; i--,j++) {
          if(board[i][j]){
              return false;
          }
        }

        return true;
    }

    private static void display(boolean[][] board) {
      for(boolean []row :board){
          for(boolean element :row){
              if(element) {
                  System.out.print("Q");
              }else {
                  System.out.print("x");
              }
          }
          System.out.println();
      }

    }


}
