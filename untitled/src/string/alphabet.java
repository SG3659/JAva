package string;

public class alphabet {
    public static void main(String[] args) {
        //atoz print
//        String string=" ";
//        for (int i = 0; i <26 ; i++) {
//            char ch=(char)('a'+i);
//            string+= ch;
//            System.out.println(string);
//        }
//        System.out.println(string);
//        StringBuilder string=new StringBuilder();
//        for (int i = 0; i <26 ; i++) {
//            char ch=(char)('a'+i);
//                string.append(ch);
//        }
//        System.out.println(string);

        // palindrome
        String s="abcdcba";
        System.out.println(ispalindrome(s))
        ;



    }

    public static boolean ispalindrome(String str) {
        str.toLowerCase();
        for (int i = 0; i <str.length()/2 ; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;

    }
}
