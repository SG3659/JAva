package recursionsubsetsubsequence;

import java.util.ArrayList;

public class skipchar {
    public static void main(String[] args) {
        string("","baccad");
    }
    static void string (String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);
        if(ch=='a'){
            string(p,up.substring(1));
        }else {
            string(p+ch,up.substring(1));
        }
    }
}
