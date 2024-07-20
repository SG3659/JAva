package recursionsubsetsubsequence;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        subset("","abc");
        ArrayList<String>ans=arrsubset("","abc");
        System.out.println(ans);
        subsetascii(" ","abc");
        ArrayList<String>ansarr=arrsubsetarr("","abc",new ArrayList<>());
        System.out.println(ansarr);
    }
    public static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subset(p+ch,up.substring(1));//pick
        subset(p,up.substring(1));//notpick
    }
    public static void subsetascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subsetascii(p+ch,up.substring(1));//pick
        subsetascii(p,up.substring(1));//notpick
        subsetascii(p+(ch+0),up.substring(1));
    }
    // passing by arraylist in function body

    static ArrayList<String> arrsubset(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);

        ArrayList<String>left= arrsubset(p+ch,up.substring(1));//pick
        ArrayList<String>rigth=arrsubset(p,up.substring(1));//notpick
        left.addAll(rigth);
        return left;
    }
    static ArrayList<String> arrsubsetarr(String p, String up, ArrayList<String>list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        list=arrsubsetarr(p+ch,up.substring(1),list);
        list =arrsubsetarr(p,up.substring(1),list);
        return list;
    }
}
