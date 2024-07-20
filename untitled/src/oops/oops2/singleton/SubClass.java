package oops.oops2.singleton;

import oops.oops4.access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }


    //protected class access subclass of A property
     public static void main(String[] args) {
        //SubClass obj = new SubClass(45,"sahil");
        // in same package it will work not in different package
        //A a =new A (45,"sahil");
        //System.out.println(a.num);
    }
}
class subSubClass extends SubClass {
    public subSubClass(int num, String name) {
        super(num, name);
    }

}
