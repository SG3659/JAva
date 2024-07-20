package oops.oops4.access;

public class main {
    public static void main(String[] args) {
        A obj = new A(5, "sahil");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members
        System.out.println(obj.getNum());
        System.out.println(obj.num);// procted in same package
    }
}
