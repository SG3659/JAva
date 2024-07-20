package oops.oops4.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }
    //protected class access subclass of A property
    public static void main(String[] args) {
        SubClass obj = new SubClass(45,"sahil");
        int n=obj.num;
        // in same package it will work not in different package
        // A a =new A (45,"sahil");
        // System.out.println(a.num);
        System.out.println(obj instanceof SubClass );
    }
}
