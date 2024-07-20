package oops.oops5abstarctclassesinterfaesannotations.abstractdemo;

public  class Daughter extends Parent {
//    public Daughter(int age){
//        this.age=age;
//    }


    public Daughter(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void carrer() {
        System.out.println("i want to be become a doctor");
    }

    @Override
    void partner() {
        System.out.println("i love tony stark");
    }
}
