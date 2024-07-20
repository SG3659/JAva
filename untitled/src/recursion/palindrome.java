package recursion;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1234321));
        System.out.println(rev(1234321));
    }
    static boolean palin(int n){
        return (n==rev(n));
    }
    public static int rev(int n){
        // sometimes you migth need some additional variable int arument
        // in that case, make another function
        int digit =(int)(Math.log10(n))+1;
        return helper(n, digit);
    }
    public static  int helper(int n,int digit){
        if(n%10==n){
            return n;
        }
        int rem =n%10;
        return rem*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }

}
