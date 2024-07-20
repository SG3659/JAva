package recursionsubsetsubsequence;

public class skipstring {
    public static void main(String[] args) {
        System.out.println(skipstring("bcdapplefg "));
        System.out.println(skipappnotapple ("bcdapplefg"));
    }
    static String skipstring (String up){
        if(up.isEmpty()) {
            return " ";
        }
        char ch =up.charAt(0);
        if(up.startsWith("apple")){
            return skipstring(up.substring(5));
        }else {
            return  ch+skipstring(up.substring(1));
        }

    }
    static String skipappnotapple (String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipappnotapple(up.substring(3));
        } else {
            return ch + skipappnotapple(up.substring(1));
        }
    }
}
