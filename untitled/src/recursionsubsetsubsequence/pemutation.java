package recursionsubsetsubsequence;

import java.util.ArrayList;

public class pemutation {
    public static void main(String[] args) {

        //permutation("","abc");
        ArrayList<String>ansa=permutationlist("","abc");
        System.out.println(ansa);
    }
    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        };
        for (int i=0;i<=p.length();i++){
            String f= p.substring(0,i);
            String s=p.substring(i,p.length());
            char ch =up.charAt(0);
            permutation(f+ch+s,up.substring(1));
        }
    }
    public static ArrayList<String> permutationlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String>ans=new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationlist(f+ch+s,up.substring(1)));
        }
        return ans;
    }
}
