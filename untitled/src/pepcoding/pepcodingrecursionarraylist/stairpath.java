package pepcoding.pepcodingrecursionarraylist;

import java.util.ArrayList;

public class stairpath {
    public static void main(String[] args) {
        //ArrayList<String>ans=getpath(4);
        //System.out.println(ans);
        int ans =getpath(5);
        System.out.println(ans);
    }
  /*  public static ArrayList<String> getpath(int n){
        if(n==0){// reach at ground floor
            ArrayList<String>bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }else if(n<0){// no ahead move in stairs
            ArrayList<String>bres=new ArrayList<>();
            return bres;
        }
        ArrayList<String>path1=getpath(n-1);//1
        ArrayList<String>path2=getpath(n-2);//2
        ArrayList<String>path3=getpath(n-3);//3

        ArrayList<String> paths=new ArrayList<>();//4
        for ( String path:path1){
            paths.add(1+path);
        }
        for (String path :path2){
            paths.add(2+path);
        }
        for (String path:path3){
            paths.add(3+path);
        }
        return paths;//8
    }*/
    public static int  getpath(int n){
        if(n==0){
            return 1;
        } else if (n<0) {
            return 0;
        }
        System.out.println("hello"+n);
        int path1=getpath(n-1);
        int path2=getpath(n-2);
        int path3=getpath(n-3);
        int p=path1+path2+path3;
        return p;
    }
}
