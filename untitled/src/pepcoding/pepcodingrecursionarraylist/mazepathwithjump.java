package pepcoding.pepcodingrecursionarraylist;

import java.util.ArrayList;

public class mazepathwithjump {
    public static void main(String[] args) {
        ArrayList<String>ans=getmazepath(1,1,3,3);
        System.out.println(ans);

    }
    public static ArrayList<String> getmazepath(int sr,int sc,int dr,int dc ){
        if(sr==dr && sc==dc ){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths=new ArrayList<>();
        //horizontal move
        for (int ms=1;ms<=dc-sc;ms++){
            ArrayList<String>pathsh=getmazepath(sr,sc+ms,dr,dc);
            for(String path:pathsh){
                paths.add("h"+ms+path);
            }
        }
        // vetrical move
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String>pathsv=getmazepath(sr+ms,sc,dr,dc);
            for (String path:pathsv){
                paths.add("v"+ms+path);
            }
        }
        for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
            ArrayList<String>pathsv=getmazepath(sr+ms,sc+ms,dr,dc);
            for (String path:pathsv){
                paths.add("d"+ms+path);
            }
        }
        return paths;
    }
}
