package oops.oops2.staticDemo;

public class varmetfundemos {
    static int a=2 ;
    static int b;

    static void  method(int x){
        System.out.println("x="+x);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    static {
        System.out.println("static block intialized");
        b=a*4;
    }

    public static void main(String[] args) {
     method(45);
    }



}

