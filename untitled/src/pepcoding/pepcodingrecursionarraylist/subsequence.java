package pepcoding.pepcodingrecursionarraylist;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        sub(" ", "abc");
        ArrayList<String> ans=subbody("","abc");
        System.out.println(ans);
        ArrayList<String> ans2=subarrg("","abc",new ArrayList<>());
        System.out.println(ans2);

    }


    public static void sub(String accept,String original){
        if(original.isEmpty()){
            System.out.println(accept);
            return;
        }
        char ch = original.charAt(0);
        sub(accept, original.substring(1));
        sub(accept + ch, original.substring(1));
        sub(accept + (ch + 0), original.substring(1));

    }
        // arraylist in body
    public static ArrayList<String>subbody(String p, String up){
        ArrayList<String>list=new ArrayList<>();
        if(up.isEmpty()){
            System.out.println(p);
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> rigth =subbody(p+ch,up.substring(1));//pick
        ArrayList<String> left= subbody(p,up.substring(1));//notpick
        rigth.addAll(left);
        return rigth;
    }
    //array list in argument
    public static ArrayList<String> subarrg (String p,String up,ArrayList<String>list){
        if(up.length()==0){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        list= subarrg(p+ch,up.substring(1),list);
        list= subarrg(p,up.substring(1),list);
        return list;
    }

}
