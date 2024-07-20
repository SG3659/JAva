package recursion;

public class smbasicrecur {
    public static void main(String[] args) {
       /* pdi(4);*/
        //int ans=fac(5);
        int ans=power(2,3);
       // double ans=poweralgo(2,-3);
        System.out.println(ans);
    }
    //pdi
     /*public static void pdi(int n) {

        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }*/

    //factorial
   /* public static int fac(int n) {
        if(n==1) {
            return 1;
        }
        return n*fac(n-1);
    }*/

    // power xn
    public static int  power(int x,int n) {
        if(n==0){
            return 1;
        }

       // int xpnb2=power(x,n-1);
//        int xn=x*xpnb2;
//        return xn;

        return x*power(x,n-1);

    }


    //recursive power(x,n) algo for positive no and negative
    /*public static int  poweralgo(int x, int n) {
        if(n == 0){
            return 1;
        }
        long N=n;
        if(N<0){
            N=-N;
            x=1/x;
            int xpn=poweralgo(x,(int)(N/2));
            int xn1 =xpn*xpn;
            if(N%2==1){
                xn1=x*xn1;
            }
            return xn1;
        }
        else {
            int xpn2 = poweralgo(x, n / 2);
            int xn = xpn2 * xpn2;
            if (n % 2 == 1) {
                xn = x * xn;
            }
            return xn;
        }
    }*/
}

