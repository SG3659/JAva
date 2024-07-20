package pepcoding.pepcodingrecursionarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ketpaddial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str= scn.next();
        ArrayList<String>ans=kpc(str);
        System.out.println(ans);
    }
    static String[]word={"abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String>kpc(String str){
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);//1
        String ros=str.substring(1);//2
        ArrayList<String> res=kpc(ros);//3
        ArrayList<String>mres=new ArrayList<>();//4
        //5
        String kword=word[ch-'0'];
        for (int i = 0; i <kword.length() ; i++) {
            char sch=kword.charAt(i);
            for(String rstr:res){
                mres.add(sch+rstr);
            }
        }
        return mres;//6
    }
}
