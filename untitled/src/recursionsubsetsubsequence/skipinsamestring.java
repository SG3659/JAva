package recursionsubsetsubsequence;

public class skipinsamestring {
    public static void main(String[] args) {
        System.out.println(string("baccad"));
    }
    static String string (String up){
        if(up.isEmpty()) {

            return " ";
        }
        char ch =up.charAt(0);
        if(ch=='a'){
            return string(up.substring(1));
        }else {
            return ch + string(up.substring(1));
        }
    }

}


