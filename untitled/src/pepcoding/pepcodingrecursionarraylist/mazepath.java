package pepcoding.pepcodingrecursionarraylist;

import java.util.ArrayList;

public class mazepath {
    public static void main(String[] args) {
    ArrayList<String>ans=getmazepath(1,1,3,3);
        System.out.println(ans);
    }
    public static ArrayList<String>getmazepath(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String>bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }

        ArrayList<String> pathh=new ArrayList<>();//1
        ArrayList<String> pathv=new ArrayList<>();//2
        if(sc<dc){
             pathh=getmazepath(sr,sc+1,dr,dc);
        }
        if(sr<dr){
             pathv =getmazepath(sr+1,sc,dr,dc);
        }
        ArrayList<String>mazepath=new ArrayList<>();
        for (String path:pathh){//3
            mazepath.add("h"+path);
        }
        for ( String path:pathv){
            mazepath.add("v"+path);
        }
        return mazepath ;//4
    }
}
