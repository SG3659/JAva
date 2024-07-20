package oops.oops5abstarctclassesinterfaesannotations.interfaces.staticinterface;

public class Main implements A,B {


    @Override
    public void greet() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.greet();
        A.wide();
    }

}
