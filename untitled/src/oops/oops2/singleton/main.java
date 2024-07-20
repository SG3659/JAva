package oops.oops2.singleton;

import oops.oops4.access.A;

public class main {
    public static void main(String[] args) {
        Singleton obj= Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();
        A a=new A(4,"nikhil");
        a.getNum();
    }

}
