package recursion;

public class nto1 {
    public static void main(String[] args) {
        //num(5); //number print

        //System.out.println(fac(5));//fac print
        //System.out.println(sumoddigit(22345));
    }

    public static void num(int n) {
        if(n==0){
            return ;
        }
        /*System.out.println(n);
        num(n-1);*/
        /*System.out.println(n);

        num(n-1);
        System.out.println(n);*/

       /* System.out.println(n);
        num(--n);*/

    }

    public static int  fac(int n) {
        if(n<=1){
            return 1;
        }
        int fact=fac(n-1);
        int xn=n*fact;
        return xn;
    }
    public static int  sumoddigit(int n) {
      if(n%10==n){//last digit return same
          return n;
      }

      return (n%10)+sumoddigit(n/2);

    }
    static int sum=0;


}
