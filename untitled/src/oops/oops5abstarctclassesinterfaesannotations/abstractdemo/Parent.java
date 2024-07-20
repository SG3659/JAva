package oops.oops5abstarctclassesinterfaesannotations.abstractdemo;

public abstract class Parent {
    int age ;

    public Parent(int age) {
        this.age = age;
    }
    // we cannot create absteract static method

// normal function
    void normal(){
        System.out.println("normal function");
    }

    //
    static void hello(){
        System.out.println("hello guys");
    }

    abstract void carrer ();
    abstract void partner ();
}
