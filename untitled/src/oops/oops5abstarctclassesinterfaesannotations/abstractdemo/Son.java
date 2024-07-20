package oops.oops5abstarctclassesinterfaesannotations.abstractdemo;

public  class Son extends Parent {
//    Son(int age){
//        this.age=age;
//    }


    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void carrer() {
        System.out.println("t want to be become a  coder");
    }

    @Override
    void partner() {
        System.out.println("i love pepper pots");
    }
}
